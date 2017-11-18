/** @version $Id: InsertSection.java,v 1.4 2015/11/12 17:13:05 ist180967 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Section;

/**
 * §2.2.5.
 */
public class InsertSection extends SectionCommand {
  public InsertSection(Section document) {
    super(MenuEntry.INSERT_SECTION, document);
  }

  @Override
  public final void execute() throws DialogException, IOException {
  	int index = IO.readInteger(Message.requestSectionId());
  	String title = IO.readString(Message.requestSectionTitle());
  	_receiver.insertSection(index,new Section(title));
  }
}
