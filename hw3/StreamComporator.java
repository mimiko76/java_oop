package HW.hw3;

import java.util.Comparator;

public class StreamComporator implements Comparator<Potok> {
    @Override 
    public int compare(Potok potok1,Potok potok2){
        return Integer.compare(potok1.studiesGroup.size(), potok2.studiesGroup.size());
    }
}
