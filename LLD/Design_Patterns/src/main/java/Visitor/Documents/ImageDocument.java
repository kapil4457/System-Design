package Visitor.Documents;

import Visitor.Document;
import Visitor.DocumentVisitor;

public class ImageDocument implements Document {

    private final int width;
    private final int height;

    public ImageDocument(int _width, int _height){
        this.height = _height;
        this.width = _width;
    }


    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
