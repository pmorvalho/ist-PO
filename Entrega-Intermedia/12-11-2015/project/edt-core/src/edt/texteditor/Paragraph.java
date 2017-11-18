package edt.texteditor;

import edt.texteditor.TextElement;
import java.util.Map;
import java.util.TreeMap;
import java.io.Serializable;

public class Paragraph extends TextElement implements Serializable{
	private String _text;

	public Paragraph(String id, String text){
		super(id);
		_text=text;
	}

	public String showContent(){
		return "";
	}

	public void editParagraph(String id, String text){}

	public int getParagraphBytes(){
		return _text.length();
	}

}