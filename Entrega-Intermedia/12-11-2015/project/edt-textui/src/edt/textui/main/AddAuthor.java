/** @version $Id: AddAuthor.java,v 1.6 2015/11/12 17:16:47 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Author;
import edt.texteditor.Editor;
import edt.texteditor.Document;
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
	  	String author_email = IO.readString(Message.requestEmail());
	  	if(!_receiver.addAuthor(author_name,author_email))
	  		IO.println(Message.duplicateAuthor(author_name));
	  }
}
