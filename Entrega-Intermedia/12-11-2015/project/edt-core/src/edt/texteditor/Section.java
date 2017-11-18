package edt.texteditor;

import edt.texteditor.TextElement;
import edt.texteditor.Paragraph;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Section extends TextElement implements Serializable {
	private ArrayList<Section> _subsections = new ArrayList<Section>();
	private ArrayList<Paragraph> _paragraphs = new ArrayList<Paragraph>();
	private String _title;

	public Section(String title){
		super("");
		_title = title;
	}
	public Section(String id, String title){
		super(id);
		_title=title;
	}

	public String showContent(){
		return "";
	}

	// Methods for title

	public void changeTitle(String title){
		_title=title;
	}

	public String getTitle(){
	  return _title;
	}

	/* Methods for subsections*/

	public ArrayList<Section> getSubsections(){
		return _subsections;
	}

	public Section getSection(String id){
	 Section WantedSection = new Section(id);
	  for(Section section : _subsections){
	    if (section.get_id()==id){
	      WantedSection=section;
	    }
	  }
	  return WantedSection;
	}
	public void insertSection(Section subsection){
		_subsections.add(subsection);
	}
	public void insertSection(int index,Section subsection){
		if(index >= _subsections.size()){ // inserir no fim
			_subsections.add(subsection);
		}
		else{ // inserir no indice recebido
			_subsections.add(index,subsection);
		}
	}
	
	public List<String> listSections(){
		List<String> sections_list = new ArrayList<String>();
		for (Section section : _subsections) {
			sections_list.add(section.get_id());
			sections_list.add(section.getTitle());
		}
		return sections_list;
	}
	
	public Section selectSection(String id){
	  for(Section section : _subsections){
	    if (section.get_id()==id){
	      return section;
	    }
	  }
	  return null;
	}
	
	// Methods for paragraphs
	public void insertParagraph(String text){
		_paragraphs.add(new Paragraph("",text));
	}
	public void insertParagraph(int index,Paragraph paragraph){
		if(index >= _paragraphs.size()){ // inserir no fim
			_paragraphs.add(paragraph);
		}
		else{ // inserir no indice recebido
			_paragraphs.add(index,paragraph);
		}
	}

	public int getBytes(){
		int bytes=0;

		for(Paragraph p: _paragraphs){
			bytes+=p.getParagraphBytes();
		}

		for(Section s: _subsections){
			bytes+= s.getBytes();
		}

		return bytes + _title.length();
	}
	
}
