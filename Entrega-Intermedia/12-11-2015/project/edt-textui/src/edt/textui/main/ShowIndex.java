/** @version $Id: ShowIndex.java,v 1.5 2015/11/12 19:50:09 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import java.util.List;

import edt.texteditor.Editor;
import edt.texteditor.Document;

/**
 * §2.1.4.
 */
public class ShowIndex extends Command<Editor> {
	public ShowIndex(Editor editor) {
		super(MenuEntry.SHOW_INDEX, editor);
	}

	@Override
	public final void execute() throws DialogException, IOException {
		IO.println("{"+_receiver.getDocumentTitle()+"}");
		List<String> list = _receiver.getTopSections();
		for(int i=0; i < list.size();i = i + 2){
			IO.println(Message.sectionIndexEntry(list.get(i),list.get(i+1)));
		}
	}
}
