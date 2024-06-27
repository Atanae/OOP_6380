package service;

import model.Stream;
import model.StreamComparator;

import java.util.Collections;
import java.util.List;

public class StreamService {
    public void sortStreamsBySize(List<Stream> streams){
        Collections.sort(streams, new StreamComparator());
    }
}
