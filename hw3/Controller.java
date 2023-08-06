package HW.hw3;

import java.util.List;

public class Controller {
    private PotokService potokService;
    public Controller(PotokService potokService){
        this.potokService = potokService;
    }

    public void sortPotoks(List<Potok> potoks){
        potokService.sortPotok(potoks);
    }
}
