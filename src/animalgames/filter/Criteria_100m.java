package animalgames.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应的筛选出满足参加100m的animal
 */
public class Criteria_100m implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> _100m = new ArrayList<Animal>();
        for(Animal animal : animals){
            if(animal.getproject().equalsIgnoreCase("100m")){
                _100m.add(animal);
            }
        }
        return _100m;
    }
}
