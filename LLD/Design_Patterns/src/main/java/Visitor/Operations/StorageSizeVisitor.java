package Visitor.Operations;

import Visitor.DocumentVisitor;
import Visitor.Documents.AudioDocument;
import Visitor.Documents.ImageDocument;
import Visitor.Documents.TextDocument;

import java.nio.charset.StandardCharsets;

public class StorageSizeVisitor implements DocumentVisitor {
    @Override
    public void visit(TextDocument document) {
        int bytes = document.getContent().getBytes(StandardCharsets.UTF_8).length;
        System.out.println("Text size is: "+bytes+" bytes.");
    }

    @Override
    public void visit(ImageDocument document) {
        long bytes = (long)document.getWidth() * document.getHeight() * 4;
        System.out.println("Image size estimate is: "+bytes+" bytes.");
    }

    @Override
    public void visit(AudioDocument document) {
        long bytes = (long) document.getDuration() * document.getBitrate() * 1000/8;
        System.out.println("Audio size estimate: "+bytes+" bytes.");
    }
}
