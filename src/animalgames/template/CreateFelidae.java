package TemplatePattern;

public class CreateFelidae {
    /*
    *   测试用 main demo
    *
        public static void main(String[] args){
            Felidae newTiger = new Tiger();
            newTiger.initialize();
            newTiger.meow();
            newTiger.play();
            System.out.println();
            Felidae newCat = new Cat();
            newCat.meow();
            newCat.play();
    }
    */
    public Felidae create(String usage){
        if (usage == "cat"){
            Felidae newCat = new Cat();
            return newCat;
        }
        else if (usage == "tiger"){
            Felidae newTiger = new Tiger();
            return newTiger;
        }
        else{
            System.out.println("wrong input");
            return null;
        }
    }
}
