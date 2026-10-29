package Visitor;

import Visitor.Documents.AudioDocument;
import Visitor.Documents.ImageDocument;
import Visitor.Documents.TextDocument;
import Visitor.Operations.ExportVisitor;
import Visitor.Operations.StorageSizeVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new TextDocument("Hello World!!"),
                new ImageDocument(1920,1080),
                new AudioDocument(120,128)
        );

        DocumentVisitor visitor = new StorageSizeVisitor();
        for(Document document: documents){
            document.accept(visitor);
        }

        visitor = new ExportVisitor();
        for(Document document: documents){
            document.accept(visitor);
        }

    }
}
