package edt.texteditor;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import java.io.Serializable;

import edt.texteditor.Author;
import edt.texteditor.Section;

public class Document extends Section implements Serializable {
	private TreeMap<String,TextElement> _elements = new TreeMap<String,TextElement>();
	private ArrayList<Author> _authors = new ArrayList<Author>();
	
	public Document(String id,String title){ // constructor incompleto
		super(id,title);
	}
	
	// Author methods
	public ArrayList<Author> get_authors()	{	
		return _authors;			
	}

	public void addAuthor(Author author)	{	
		_authors.add(author);		
	}

	public boolean duplicateAuthor(String name, String email){	
		for(Author i: _authors){
			if(i.get_name().equals(name) && i.get_email().equals(email))
				return true;
		}
		return false;
	}
 
 	// TextElement methods
 	public boolean has_TextElement(String id){
 		return _elements.containsKey(id);
 	}

 	public String show_TextElement(String id){
 		return _elements.get(id).showContent();
 	}

 	public void add_TextElement(TextElement element){
 		_elements.put(element.get_id(),element);
 	}

 	public TextElement get_TextElement(String id){
 		return _elements.get(id);
 	}

 	public List<String> listTopSections(){
 		sections = getSubsections();
 		List<String> sections_list = new ArrayList<String>();
 		for (Section section : sections) {
			topSectionsList.add(section.get_id());
			topSectionsList.add(section.getTitle());
		}
		return topSectionsList;
 	}
}