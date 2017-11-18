/** @version $Id: Save.java,v 1.7 2015/11/12 17:16:47 ist180967 Exp $ */
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
		String filename = _receiver.getDocument().get_id();
		// Ver se o documento e anonimo
		if(filename.equals(""))
			filename = IO.readString(Message.newSaveAs());
		// Ver se o documento sofreu alteracoes
		_receiver.save(filename);
		/* FIXME: implement command */
	}
}
