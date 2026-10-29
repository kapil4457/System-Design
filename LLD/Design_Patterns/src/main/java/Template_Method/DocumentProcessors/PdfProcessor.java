package Template_Method.DocumentProcessors;

import Template_Method.DocumentProcessor;
import Template_Method.IDocumentProcessor;

import javax.swing.text.Document;

public class PdfProcessor extends DocumentProcessor {

    @Override
    protected void loadDocument(String file) {
        System.out.println("Loading PDF file :"+file);
    }

    @Override
    protected String extractText(String file) {
        System.out.println("Extracting PDF file: "+file);
        return "Extracted text from PDF file is ....";
    }


    @Override
    protected boolean shouldValidateMetadata(){
        return true;
    }
}




/*
- Both of the follows the same flow to process a document
- There are some common implementations shared between them.
- The core list of functionalities is exactly the same

 */