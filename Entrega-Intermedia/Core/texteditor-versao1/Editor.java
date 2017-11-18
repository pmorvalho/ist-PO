package texteditor;

import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
 
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class Editor {
	private Document _document;
	public Document getDocument(){
		return _document;
	}
	public void newDocument(){
		_document = new Document("");
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
}
