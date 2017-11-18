package texteditor;

import texteditor.TextElement;
import texteditor.Paragraph;
import java.util.Map;
import java.util.TreeMap;
import java.io.Serializable;

public class Section extends TextElement implements Serializable {
	private Map<String,Section> _subsections = new TreeMap<String,Section>();
	private Map<String,Paragraph> _paragraphs = new TreeMap<String,Paragraph>();
	private String _title;

	public Section(String id, String title){
		super(id);
		_title=title;
	}

	public void changeTitle(String new_title){}

	public String listSections(){}

	public void selectSection(String id){}

	public void setTitle(String title){
		_title=title;
	}

	public String getTitle(){
		return _title;
	}

	public void addSection(Section subsection){
		return _subsections.put((subsection.get_id()),subsection);
	}

	public void addSection(Section paragraph){
		return _paragraphs.put((paragraph.get_id()),paragraph);
	}

}
