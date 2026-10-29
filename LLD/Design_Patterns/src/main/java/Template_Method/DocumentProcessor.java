package Template_Method;

public abstract class DocumentProcessor {


    // Defined the flow/layout that each document processor follows
    public final void process(String file){
        loadDocument(file);
        String text = extractText(file);

        if(shouldValidateMetadata()){
            System.out.println("Validating metadata....");

        }
        text = cleanText(text);
        String summary = generateSummary(text);
        saveSummary(summary);
    }


    // These are the functionalities which will have different implementations for each processor
    protected abstract void loadDocument(String file);
    protected abstract String extractText(String file);


    // These are the common/shared implementation of some functionalities which can be used by different processors.
    // If required, it can be overridden as per each processor requirement
    // This is kind of like a default implementation that we are providing for each of the below shared functionalities.
    protected String cleanText(String text){
        System.out.println("Cleaning the text...");
        return text.trim();
    }

    protected String generateSummary(String text){
        System.out.println("Generating the summary...");
        return "Summary for text: "+text;
    }

    protected void saveSummary(String summary){
        // We can have the logic to save the summary in the database

        System.out.println("Summary saved to database");
    }


    protected boolean shouldValidateMetadata(){
        return false;
    }


}
