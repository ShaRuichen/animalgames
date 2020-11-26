package animalgames.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应的筛选出满足参加marathon的animal
 */
public class Criteria_marathon implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> marathon = new ArrayList<Animal>();
        for(Animal animal : animals){
            if(animal.getproject().equalsIgnoreCase("marathon")){
                marathon.add(animal);
            }
        }
        return marathon;
    }
}
