package Facade.Services;

import java.util.List;

public class VectorSearchService {

    public List<String> search(float[] embeddings){
        System.out.println("Inside Vector Search Service");
        return List.of("DOC-1","DOC-2");
    }
}
