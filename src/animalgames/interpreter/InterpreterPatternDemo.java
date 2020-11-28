package animalgames.interpreter;
import animalgames.Entry;
//使用Expression类来创建规则，并解析他们
public class InterpreterPatternDemo {
    

    //规则：Robert 和 John 是小狗和小狼
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("小狗");
        Expression john = new TerminalExpression("小狼");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个小猫
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("猫");
        Expression married = new TerminalExpression("小");
        return new AndExpression(julie, married);
    }
    @Entry(title = "解析")
    public static void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("小狗跑步? " + isMale.interpret("小狗"));
        System.out.println("小猫跑步? "
                + isMarriedWoman.interpret("小猫"));
    }
}