package animalgames.iterator;
//创建实现了接口的实体类
public class game_name implements Iterable{
    public String names[] = {"足球" , "篮球" ,"游泳" , "乒乓球"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
