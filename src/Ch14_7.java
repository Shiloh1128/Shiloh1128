// Default method (default 方法)
// default 方法可以繼承
// 重複定義此方法
// 宣告為抽象方法
interface Bird{
    int age = 5;

    default void fly(){ // 因為用了default,可以把實作直接寫在interface裡面
        System.out.println("正在飛");
    }
}

class FlyInfo implements  Bird{
    public void flyInfo(){
        System.out.println("鳥在飛");
    }
}


public class Ch14_7 {
    public static void main(String[] args) {
        FlyInfo f = new FlyInfo();
        f.fly();
    }
}
