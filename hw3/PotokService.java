package HW.hw3;

import java.util.Comparator;
import java.util.List;

public class PotokService {
    public void sortPotok (List<Potok> potoks){
        potoks.sort(new StreamComporator());
        
    }
}
