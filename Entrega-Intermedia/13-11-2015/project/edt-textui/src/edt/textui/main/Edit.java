/** @version $Id: Edit.java,v 1.6 2015/11/12 22:46:07 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Editor;
import edt.texteditor.Document;
/**
 * §2.3.1.
 */
public class Edit extends Command<Editor> {
  public Edit(Editor editor) {
    super(MenuEntry.OPEN_DOCUMENT_EDITOR, editor);
  }

  @Override
  public final void execute() throws DialogException, IOException {
    edt.textui.section.MenuBuilder.menuFor(_receiver.getDocument(),_receiver.getDocument());
  }

}
