/** @version $Id: NameSection.java,v 1.10 2015/11/30 20:58:11 ist181151 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Section;
import edt.texteditor.Document;
import edt.texteditor.NoSuchSectionException;
/**
 * §2.2.6.
 */
public class NameSection extends SectionCommand {
	public NameSection(Document document,Section section) {
		super(MenuEntry.NAME_SECTION,document, section);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		int localid = IO.readInteger(Message.requestSectionId());
		String uniqueid = IO.readString(Message.requestUniqueId());
		try{
			boolean changed= _document.nameSection(uniqueid,localid,_receiver);
			if(changed == false){
				IO.println(Message.sectionNameChanged());
			}
		}
		catch(NoSuchSectionException e){
			IO.println(Message.noSuchSection(localid));
		}
	}
}
