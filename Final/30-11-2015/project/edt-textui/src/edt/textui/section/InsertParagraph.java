/** @version $Id: InsertParagraph.java,v 1.5 2015/11/23 02:52:49 ist181151 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;
import edt.texteditor.Document;

/**
 * §2.2.8.
 */
public class InsertParagraph extends SectionCommand {
	public InsertParagraph(Document document,Section section) {
		super(MenuEntry.INSERT_PARAGRAPH,document,section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
	        int localId = IO.readInteger(Message.requestParagraphId());
		String texto = IO.readString(Message.requestParagraphContent());
		_receiver.insertParagraph(localId,texto);	
	}

}
