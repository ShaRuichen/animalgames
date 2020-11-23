package Iterator;

public class Demo {
    public static void main(String[] args) {
        Player namesRepository = new Player();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
