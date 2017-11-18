package texteditor;

import java.io.Serializable;

public abstract class TextElement implements Serializable {
	private String _id;

	public TextElement(String id){
		_id = id;
	}
	
	public String get_id(){	
		return _id;	
	}

}