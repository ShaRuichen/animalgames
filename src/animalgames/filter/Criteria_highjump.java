package animalgames.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应的筛选出满足参加highjump的animal
 */
public class Criteria_highjump implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> highjump = new ArrayList<Animal>();
        for(Animal animal : animals){
            if(animal.getproject().equalsIgnoreCase("highjump")){
                highjump.add(animal);
            }
        }
        return highjump;
    }
}
