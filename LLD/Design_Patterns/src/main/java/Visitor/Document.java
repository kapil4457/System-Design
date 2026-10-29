package Visitor;

public interface Document {
    void accept(DocumentVisitor visitor);
}
