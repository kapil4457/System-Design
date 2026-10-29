package Template_Method.DocumentProcessors;

import Template_Method.DocumentProcessor;

public class WordProcessor extends DocumentProcessor {

    @Override
    protected void loadDocument(String file) {
        System.out.println("Loading Word file :"+file);
    }

    @Override
    protected String extractText(String file) {
        System.out.println("Extracting Word file: "+file);
        return "Extracted text from Word file is ....";
    }
}
