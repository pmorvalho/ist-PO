/** @version $Id: EditParagraph.java,v 1.2 2015/11/11 03:36:24 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;

/**
 * §2.2.10.
 */
public class EditParagraph extends SectionCommand {
	public EditParagraph(Section section) {
		super(MenuEntry.EDIT_PARAGRAPH, section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
	  	/* FIXME: implement command */
	}

}
