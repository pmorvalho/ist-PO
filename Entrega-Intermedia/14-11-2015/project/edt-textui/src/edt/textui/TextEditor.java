/** @version $Id: TextEditor.java,v 1.8 2015/11/12 19:49:39 ist180967 Exp $ */
package edt.textui;

import static ist.po.ui.Dialog.IO;

import java.io.IOException;

import edt.texteditor.Editor;

/**
 * Class that starts the application's textual interface.
 */
public class TextEditor {
	public static void main(String[] args) {
		Editor editor = new Editor("");
		String datafile = System.getProperty("import"); //$NON-NLS-1$
		if(datafile != null){
			editor = new Editor(datafile);
		}
		edt.textui.main.MenuBuilder.menuFor(editor);
		IO.closeDown();
	}
}
