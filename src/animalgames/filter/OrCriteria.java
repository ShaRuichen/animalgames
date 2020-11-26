package filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Animal> meetCriteria(List<Animal> animals){
        List<Animal> firstcriteria = criteria1.meetCriteria(animals);
        List<Animal> seccriteria = criteria2.meetCriteria(animals);

        for(Animal animal : firstcriteria){
            if(!seccriteria.contains(animal)){
                seccriteria.add(animal);
            }
        }
        return seccriteria;
    }
}
