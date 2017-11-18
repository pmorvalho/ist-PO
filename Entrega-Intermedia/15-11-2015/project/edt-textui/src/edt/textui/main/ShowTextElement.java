/** @version $Id: ShowTextElement.java,v 1.3 2015/11/11 22:54:32 ist180967 Exp $ */
package edt.textui.main;

import static ist.po.ui.Dialog.IO;
import ist.po.ui.Command;
import ist.po.ui.DialogException;

import java.io.IOException;

import edt.texteditor.Editor;

/* FIXME: import core classes here */

/**
 * §2.1.5.
 */
public class ShowTextElement extends Command<Editor> {
  public ShowTextElement(Editor receiver) {
    super(MenuEntry.SHOW_TEXT_ELEMENT, receiver);
  }

  @Override
  public final void execute() throws DialogException, IOException {
    /* FIXME: implement command */
  }
}
