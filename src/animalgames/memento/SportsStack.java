package animalgames.memento;

//管理者：项目栈
class SportsStack{
    private Sports sport[];
    private int top;

    SportsStack(){
        sport=new Sports[5];
        top=-1;
    }

    public boolean push(Sports p){
        if(top>=4){
            System.out.println("没有更多选项啦！");
            return false;
        }
        else{
            sport[++top]=p;
            return true;
        }
    }

    public Sports pop(){
        if(top<=0){
            System.out.println("项目栈空了！");
            return sport[0];
        }
        else return sport[top--];
    }
}

