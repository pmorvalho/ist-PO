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
			if(filename.equals("")){
			    _document = new Document("","");
			}
			else{
				_document = new Document(filename,"");
				BufferedReader r = new BufferedReader(new FileReader(filename));
				String linha;
				// adicionar titulo do documento 
				_document.changeTitle(r.readLine());
				String section_id = null;
				Section current_section = null;
				while ((linha = r.readLine()) != null) {
					String dados[] = linha.split("\\|");
					if(dados[0].equals("SECTION")){
						current_section = new Section(dados[1],dados[2]);
						_document.add_TextElement(current_section);
						// guardar id para adicionar paragrafos depois
						section_id = dados[1];
					}
					
					if(dados[0].equals("PARAGRAPH")){
						current_section.insertParagraph(0,new Paragraph("",dados[1])); 
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
		_document = new Document("","");
		System.out.println("Authors size: " + _document.get_authors().size());
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
			System.out.println("Abri o documento " + getDocumentTitle());
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
	public List<String> getAuthorsData(){
		return _document.getAuthorsData();
	}
	public List<Integer> getMetaData(){
		return _document.getMetaData();
	}


}
