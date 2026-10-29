package Visitor.Operations;

import Visitor.DocumentVisitor;
import Visitor.Documents.AudioDocument;
import Visitor.Documents.ImageDocument;
import Visitor.Documents.TextDocument;

public class ExportVisitor implements DocumentVisitor {
    @Override
    public void visit(TextDocument document) {
        System.out.println("Exporting text as TXT.");
    }

    @Override
    public void visit(ImageDocument document) {
        System.out.println("Exporting image as PNG.");
    }

    @Override
    public void visit(AudioDocument document) {
        System.out.println("Exporting audio as MP3.");
    }
}
