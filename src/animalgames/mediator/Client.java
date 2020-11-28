package animalgames.mediator;
import animalgames.Entry;
//Client客户端
public class Client {
             @Entry(title = "传递")
    public static void test() {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("普通动物要求动物运动员参会");
        colleague2.send("动物运动员已经参会");
    }

}