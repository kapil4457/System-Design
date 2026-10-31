package SingleResponsibilityPrinciple.Services;

public class ResponseRepository {

    // Persistence operation
    public void saveToDatabase(String response){
        System.out.println("Saving the following response to database: "+response);
    }
}
