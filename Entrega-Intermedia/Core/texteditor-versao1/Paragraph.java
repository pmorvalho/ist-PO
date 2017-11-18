package texteditor;

import texteditor.TextElement;
import java.util.Map;
import java.util.TreeMap;
import java.io.Serializable;

public class Paragraph extends Element implements Serializable{
	private String text;

	public Paragraph(String id, String text){
		super(id);
		_text=text;
	}

	public void editParagraph(String id, String text){}

}