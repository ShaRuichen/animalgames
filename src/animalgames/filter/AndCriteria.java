package animalgames.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * AndCriteria表示两个条件都满足的一个交集的Creteria
 */
public class AndCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    /**
     * 在对应第一个条件满足的情况下的animals的list中再去筛选出满足第二个条件的所有animals
     */
    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> firstcriteria = criteria1.meetCriteria(animals);
        List<Animal> seccriteria = criteria2.meetCriteria(animals);
        List<Animal> criteriax = new ArrayList<Animal>();
        for(Animal animal : firstcriteria){
            if(seccriteria.contains(animal)){
                criteriax.add(animal);
            }
        }
        return criteriax;
    }
}
