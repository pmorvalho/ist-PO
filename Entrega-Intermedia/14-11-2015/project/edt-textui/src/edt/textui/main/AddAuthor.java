/** @version $Id: AddAuthor.java,v 1.7 2015/11/14 21:11:06 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Editor;
/**
 * §2.1.3.
 */
public class AddAuthor extends Command<Editor> {
	public AddAuthor(Editor editor) {
		super(MenuEntry.ADD_AUTHOR, editor);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		String author_name = IO.readString(Message.requestAuthorName());
		while(author_name.equals("")){
			author_name = IO.readString(Message.requestAuthorName());
		}
	  	String author_email = IO.readString(Message.requestEmail());
	  	while(author_email.equals("")){
	  		author_email = IO.readString(Message.requestEmail());
	  	}

	  	if(_receiver.addAuthor(author_name,author_email) == false)
	  		IO.println(Message.duplicateAuthor(author_name));
	  }
}
