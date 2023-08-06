package HW.hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import seminars.sem3.StudentsGroup;

public class Potok implements Iterator<StudiesGroup> {
    List<StudiesGroup>studiesGroup;
    private int counter;

    public Potok(List<StudiesGroup> studiesGroups){
        this.studiesGroup = studiesGroups;
        this.counter = 0;
    }

    @Override
    public boolean hasNext(){
        return counter < studiesGroup.size();
    }

    @Override
    public StudiesGroup next(){
        return studiesGroup.get(counter++);
    }
}
