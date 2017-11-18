package edt.texteditor;

import edt.texteditor.TextElement;
import edt.texteditor.Paragraph;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/** Class Section
*   FIXME
*/
public class Section extends TextElement implements Serializable {
	/** section's list of subsections
	*/
	private ArrayList<Section> _subsections = new ArrayList<Section>();
	/** section's list of paragraphs
	*/
	private ArrayList<Paragraph> _paragraphs = new ArrayList<Paragraph>();
	/** section's title
	*/
	private String _title;

	/** Class constructor 
	*   @param new section's title
	*/
	public Section(String title){
		super("");
		_title = title;
	}

	/** Class constructor
	*   @param new section's title
	*   @param new section's id
	*/
	public Section(String id, String title){
		super(id);
		_title=title;
	}

	/** FIXME
	*
	*/
	public String showContent(){
		return "";
	}

	/* Methods for title */

	/** Changes section's title
	*   @param section's new title
	*/
	public void changeTitle(String title){
		_title=title;
	}

	/** Returns the section's title
	*   @return section's title
	*/
	public String getTitle(){
	  return _title;
	}

	/* Methods for subsections*/

	/** Returns the section's list of subsections
	*  @return section's ArrayList of subssections
	*/
	public ArrayList<Section> getSubsections(){
		return _subsections;
	}

	/** Inserts a new subsection in the section's ArrayList of subsections
	*  @param new subsection
	*/
	public void insertSection(Section subsection){
		_subsections.add(subsection);
	}

	/** Inserts a new subsection in a specific position...FIXME
	*  @param
	*  @param 
	*/
	public void insertSection(int index,Section subsection){
		if(index >= _subsections.size()){ // inserir no fim
			_subsections.add(subsection);
		}
		else{ // inserir no indice recebido
			_subsections.add(index,subsection);
		}
	}
	
	/** FIXME
	*  @return 
	*/
	public List<String> listSections(){
		List<String> sections_list = new ArrayList<String>();
		for (Section section : _subsections) {
			sections_list.add(section.get_id());
			sections_list.add(section.getTitle());
		}
		return sections_list;
	}
	
	/** FIXME
	*  @return
	*/
	public Section getSection(String id){
	  for(Section section : _subsections){
	    if (section.get_id()==id){
	      return section;
	    }
	  }
	  return null;
	}

	/** FIXME
	*  @return
	*/
	public Section selectSection(int id){
		return _subsections.get(id);
	}

	/* Methods for paragraphs */

	/** FIXME
	*  @param
	*/
	public void insertParagraph(String text){
		_paragraphs.add(new Paragraph("",text));
	}

	/** FIXME
	*  @param
	*  @param
	*/
	public void insertParagraph(int index,Paragraph paragraph){
		if(index >= _paragraphs.size()){ /* inserir no fim */
			_paragraphs.add(paragraph);
		}
		else{ /* inserir no indice recebido */
			_paragraphs.add(index,paragraph);
		}
	}

	/** Returns the seciton's dimension FIXME
	*  @return 
	*/
	public int getBytes(){
		int bytes=0;

		for(Paragraph p: _paragraphs){
			bytes+=p.getParagraphBytes();
		}

		for(Section s: _subsections){
			bytes+= s.getBytes();
		}

		return bytes + _title.length();
	}
	
}
