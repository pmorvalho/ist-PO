/** @version $Id: MenuBuilder.java,v 1.3 2015/11/12 17:13:05 ist180967 Exp $ */
package edt.textui.section;

import ist.po.ui.Command;
import ist.po.ui.Menu;

/* FIXME: import core classes here */
import edt.texteditor.Section;
/**
 * Menu builder for search operations.
 */
public class MenuBuilder {
  public static void menuFor(Section document) {
    Menu menu = new Menu(MenuEntry.TITLE,
        new Command<?>[] { //
            new ChangeTitle(document), //
            new ListSections(document), //
            new ShowContent(document), //
            new SelectSection(document), //
            new InsertSection(document), //
            new NameSection(document), //
            new RemoveSection(document), //
            new InsertParagraph(document), //
            new NameParagraph(document), //
            new EditParagraph(document), //
            new RemoveParagraph(document), //
    });
    menu.open();
  }
}
