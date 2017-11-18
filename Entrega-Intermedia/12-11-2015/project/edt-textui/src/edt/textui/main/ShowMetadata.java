/** @version $Id: ShowMetadata.java,v 1.6 2015/11/12 19:50:09 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
/* FIXME: import core classes here */
import edt.texteditor.Editor;
import edt.texteditor.Author;
import edt.texteditor.Document;

/**
 * §2.1.2.
 */
public class ShowMetadata extends Command<Editor> {
	public ShowMetadata(Editor editor) {
		super(MenuEntry.SHOW_METADATA,editor);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		IO.println(Message.documentTitle(_receiver.getDocumentTitle()));
		List<String> authors_data = _receiver.getAuthorsData();
		for (int i = 0;i < authors_data.size();i+=2) {
			IO.println(Message.author(authors_data.get(i),authors_data.get(i+1)));
		}
		List<Integer> metadata = _receiver.getMetaData();
		IO.println(Message.documentSections(metadata.get(0)));
		IO.println(Message.documentBytes(metadata.get(1)));
		IO.println(Message.documentIdentifiers(metadata.get(2)));
	}
}

