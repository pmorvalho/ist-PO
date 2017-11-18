/** @version $Id: RemoveParagraph.java,v 1.2 2015/11/11 03:36:24 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;

/**
 * §2.2.11.
 */
public class RemoveParagraph extends SectionCommand {
	public RemoveParagraph(Section section) {
		super(MenuEntry.REMOVE_PARAGRAPH, section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
      		/* FIXME: implement command */
	}

}
