/** @version $Id: ListSections.java,v 1.2 2015/11/11 03:36:24 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;

/**
 * §2.2.2.
 */
public class ListSections extends SectionCommand {
	public ListSections(Section section) {
		super(MenuEntry.LIST_SECTIONS, section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
    		/* FIXME: implement command */
	}
}
