package filter;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

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
