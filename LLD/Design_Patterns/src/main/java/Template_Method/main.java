package Template_Method;

import Template_Method.DocumentProcessors.PdfProcessor;
import Template_Method.DocumentProcessors.WordProcessor;

public class main {
    public static void main(String[] args) {

        DocumentProcessor pdf = new PdfProcessor();
        DocumentProcessor word = new WordProcessor();


        pdf.process("report.pdf");
        System.out.println("==============================");
        word.process("report.docx");
    }
}

/*

PDF
Word
Excel




 PDF/Word/Excel -> DocumentService
                        -> Load the document
                        -> Extract the text
                        -> Clean the extracted text
                        -> Generate a summary
                        -> Save the summary to database



 */