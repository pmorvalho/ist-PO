/** @version $Id: SelectSection.java,v 1.3 2015/11/12 17:13:05 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;

/**
 * §2.2.4.
 */
public class SelectSection extends SectionCommand {
	public SelectSection(Section document) {
		super(MenuEntry.SELECT_SECTION, document);
	}

	@Override
	public final void execute() throws DialogException, IOException  {
		edt.textui.section.MenuBuilder.menuFor(_receiver.selectSection(""));
	}
}
