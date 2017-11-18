package edt.texteditor;

import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
 
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

import edt.texteditor.Document;
import edt.texteditor.Author;
import edt.texteditor.Section;
import edt.texteditor.Paragraph;

public class Editor {
	private Document _document;
	public Editor(String filename){
		try{
			_document = new Document("","");
			if(!filename.equals("")){
				BufferedReader r = new BufferedReader(new FileReader(filename));
				String linha;
				// adicionar titulo do documento 
				_document.changeTitle(r.readLine());
				String old_id = null;
				while ((linha = r.readLine()) != null) {
					String dados[] = linha.split("\\|");
					if(dados[0].equals("SECTION")){
						_document.insertSection(dados[1],dados[2]);
						old_id = dados[1];
					}
					
					else if(dados[0].equals("PARAGRAPH")){
						_document.getSection(old_id).insertParagraph(dados[1]); 
					}

					else { // Author
						for (String author : dados) {
							String info[] = author.split("/");
							_document.addAuthor(info[0],info[1]);
						}
					}
				}
				r.close();
			}
		}
		catch(IOException e){ 	e.printStackTrace();	}
	}
	public Document getDocument(){
		return _document;
	}
	public void newDocument(){
		_document = new Document("","");;
	}
	public void save(String filename) throws IOException {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)));
				oos.writeObject(getDocument());
				oos.close();
			}
			catch(IOException e){}
	}

	public void open(String filename) throws IOException , FileNotFoundException{
		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));	
			Document documento = (Document)ois.readObject();
			ois.close();
			_document = documento;
		}
		catch(IOException e) {
			throw new FileNotFoundException();
		}
		catch(ClassNotFoundException e){}
	}

	public boolean addAuthor(String name,String email) {
		return _document.addAuthor(name,email);
	}
	public String getDocumentTitle(){
		return _document.getTitle();
	}
	public List<String> getTopSections(){
		return _document.getTopSections();
	}

	public List<String> getAuthorsData(){
		return _document.getAuthorsData();
	}
	public List<Integer> getMetaData(){
		return _document.getMetaData();
	}


}
