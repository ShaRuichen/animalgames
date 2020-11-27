package animalgames.filter;

import java.util.List;

/**
 * 实现Criteria的接口
 */
public interface Criteria {
    public List<Animal> meetCriteria(List<Animal> animals);
}
