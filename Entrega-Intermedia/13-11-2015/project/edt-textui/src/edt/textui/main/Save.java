/** @version $Id: Save.java,v 1.8 2015/11/13 22:39:02 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Editor;
import edt.texteditor.Document;
/**
 * Save to file under current name (if unnamed, query for name).
 */
public class Save extends Command<Editor> {
	public Save(Editor editor) {
		super(MenuEntry.SAVE, editor);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		String filename = _receiver.getDocumentFilename();
		// Ver se o documento e anonimo
		if(filename.equals(""))
			filename = IO.readString(Message.newSaveAs());
		// Ver se o documento sofreu alteracoes
		_receiver.save(filename);
	}
}
