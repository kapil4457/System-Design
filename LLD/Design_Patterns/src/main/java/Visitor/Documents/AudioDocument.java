package Visitor.Documents;

import Visitor.Document;
import Visitor.DocumentVisitor;

public class AudioDocument implements Document {

    private final int duration;
    private final int bitrate;

    public AudioDocument(int _duration, int _bitrate){
        this.duration = _duration;
        this.bitrate = _bitrate;
    }

    public int getDuration(){
        return duration;
    }

    public int getBitrate(){
        return bitrate;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
