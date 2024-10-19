interface Bird{
    default void fly(){
        System.out.println("鳥在飛");
    }
}

interface Airplane{

    default void fly(){
        System.out.println("飛機飛");
    }
}

class FlyInfo implements  Bird, Airplane{
    // 可重新定義default方法
    public void fly(){
        System.out.println("正在飛");
    }
}


public class Ch14_9 {
    public static void main(String[] args) {
        FlyInfo f = new FlyInfo();
        f.fly();
    }
}
