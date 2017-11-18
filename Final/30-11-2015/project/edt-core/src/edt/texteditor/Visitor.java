package edt.texteditor;

public interface Visitor {
	void visitDocument(Document document);
	void visitSection(Section section);
	void visitParagraph(Paragraph paragraph);
}