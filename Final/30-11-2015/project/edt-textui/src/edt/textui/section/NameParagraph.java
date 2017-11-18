/** @version $Id: NameParagraph.java,v 1.10 2015/11/30 20:58:11 ist181151 Exp $ */
package edt.textui.section;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.DialogException;

import java.io.IOException;

/* FIXME: import core classes here */
import edt.texteditor.Section;
import edt.texteditor.Document;
import edt.texteditor.NoSuchParagraphException;
/**
 * §2.2.9.
 */
public class NameParagraph extends SectionCommand {
  	public NameParagraph(Document document,Section section) {
    	super(MenuEntry.NAME_PARAGRAPH, document,section);
  	}

  	@Override
  	public final void execute() throws DialogException, IOException {
 		int localid = IO.readInteger(Message.requestParagraphId());
		String uniqueid = IO.readString(Message.requestUniqueId());
		try{
			boolean changed = _document.nameParagraph(uniqueid,localid,_receiver);
			if(changed == false){
				IO.println(Message.paragraphNameChanged());
			}
		}
		catch(NoSuchParagraphException e){
			IO.println(Message.noSuchParagraph(localid));
		}
  	}
}
