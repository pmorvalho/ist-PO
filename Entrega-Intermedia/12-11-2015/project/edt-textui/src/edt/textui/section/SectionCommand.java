/** @version $Id: SectionCommand.java,v 1.3 2015/11/12 17:13:05 ist180967 Exp $ */
package edt.textui.section;

import ist.po.ui.Command;

/* FIXME: import core classes here */
import edt.texteditor.Section;
import edt.texteditor.Section;
/**
 * Superclass of all section-context commands.
 */
public abstract class SectionCommand extends Command<Section> {
  
  /* FIXME: put here the declaration of the second receiver: the document-context one */
  
	public SectionCommand(String title, Section receiver) {
		super(title, receiver);
		/* FIXME: initialize second receiver */
	}

}
