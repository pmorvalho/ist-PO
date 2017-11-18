/** @version $Id: SectionCommand.java,v 1.6 2015/11/30 20:58:11 ist181151 Exp $ */
package edt.textui.section;

import ist.po.ui.Command;

/* FIXME: import core classes here */
import edt.texteditor.Section;
import edt.texteditor.Document;
/**
 * Superclass of all section-context commands.
 */
public abstract class SectionCommand extends Command<Section> {
  	Document _document;
	public SectionCommand(String title, Document document, Section section) {
		super(title, section);
		_document = document;
	}

}
