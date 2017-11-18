/** @version $Id: SelectSection.java,v 1.8 2015/11/30 10:09:18 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Document;
import edt.texteditor.Section;
import edt.texteditor.NoSuchSectionException;

/**
 * §2.2.4.
 */
public class SelectSection extends SectionCommand {
	public SelectSection(Document document,Section section) {
		super(MenuEntry.SELECT_SECTION, document,section);
	}

	@Override
	public final void execute() throws DialogException, IOException  {
		Integer id = IO.readInteger(Message.requestSectionId());
		try{
			_receiver.getSection(id);
			IO.println(Message.newActiveSection(id));
			edt.textui.section.MenuBuilder.menuFor(_document,_receiver.getSection(id));
		}
		catch(NoSuchSectionException e){
			IO.println(Message.noSuchSection(id));
		}
	}
}
