package animalgames.template;

public class CreateFelidae {
    /*
    * packed function for users.
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
