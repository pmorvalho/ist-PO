/** @version $Id: MenuBuilder.java,v 1.7 2015/11/12 03:25:23 ist180967 Exp $ */
package edt.textui.main;

import ist.po.ui.Command;
import ist.po.ui.Menu;

/* FIXME: import core classes here */
import edt.texteditor.Editor;

public abstract class MenuBuilder {
  public static void menuFor(Editor editor) {
    Menu menu = new Menu(MenuEntry.TITLE,
        new Command<?>[] { 
            new New(editor), 
            new Open(editor),
            new Save(editor),
            new ShowMetadata(editor),
            new AddAuthor(editor), 
            new ShowIndex(editor), 
            new ShowTextElement(editor), 
            new Edit(editor), 
    });
    menu.open();
  }
}
