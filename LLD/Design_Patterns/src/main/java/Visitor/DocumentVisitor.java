package Visitor;

import Visitor.Documents.AudioDocument;
import Visitor.Documents.ImageDocument;
import Visitor.Documents.TextDocument;

public interface DocumentVisitor {

    void visit(TextDocument document);
    void visit(ImageDocument document);
    void visit(AudioDocument document);
}
