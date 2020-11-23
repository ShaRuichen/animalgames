package filter;

import java.util.ArrayList;
import java.util.List;

public class Criteria_longjump implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> longjump = new ArrayList<Animal>();
        for(Animal animal : animals){
            if(animal.getproject().equalsIgnoreCase("longjump")){
                longjump.add(animal);
            }
        }
        return longjump;
    }
}
