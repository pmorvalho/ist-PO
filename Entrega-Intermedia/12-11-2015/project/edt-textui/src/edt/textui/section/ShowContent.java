/** @version $Id: ShowContent.java,v 1.2 2015/11/11 03:36:24 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;
/**
 * §2.2.3.
 */
public class ShowContent extends SectionCommand {
	public ShowContent(Section section) {
		super(MenuEntry.SHOW_CONTENT, section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
	  	/* FIXME: implement command */
	}
}
