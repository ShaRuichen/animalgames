package animalgames.frontcontroller;
//创建调度器Dispatcher
public class Dispatcher {
    private AnimalView animalView;
    private HomeView homeView;
    public Dispatcher(){
        animalView = new AnimalView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("ANIMALS")){
            animalView.show();
        }else{
            homeView.show();
        }
    }
}