interface Bird{
    int age = 5;
    void fly();  //抽象fly()方法
}

interface Airplane{
    int age = 10;
    void fly();   //抽象fly()方法
}

class FlyInfo implements  Bird, Airplane{
    @Override
    public void fly(){   //實作fly()方法
        System.out.println("正在飛");
        //System.out.println(age);  //產生ambiguous
        System.out.println(Airplane.age);  //介面名稱.成員名稱
        System.out.println(Bird.age);      //介面名稱.成員名稱
    }
}

public class Ch14_6 {
    public static void main(String[] args) {
        FlyInfo f = new FlyInfo();
    }
}
