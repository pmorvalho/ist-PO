/** @version $Id: Open.java,v 1.6 2015/11/11 22:54:32 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Editor;
import edt.texteditor.FileNotFoundException;
/**
 * Open existing document.
 */
public class Open extends Command<Editor> {
	public Open(Editor editor) {
		super(MenuEntry.OPEN, editor);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		String filename = IO.readString(Message.openFile());
		try {
			_receiver.open(filename);
		}
		catch (FileNotFoundException e) {
			IO.println(Message.fileNotFound());
		}
	}

}
