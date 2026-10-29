package Visitor.Documents;

import Visitor.Document;
import Visitor.DocumentVisitor;

public class TextDocument implements Document {

    private final String content;

    public TextDocument(String _content){
        this.content = _content;
    }

    public String getContent(){
        return content;
    }


    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
