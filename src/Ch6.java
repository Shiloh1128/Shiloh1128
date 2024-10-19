class Dog{
    String name;
    int age;
    String color;

    void sleep(){
        System.out.println("我正在睡覺");

    }

    void eat(){
        System.out.println("我正在吃飯");

    }

    void run(){

    }
}

public class Ch6 {
    public static void main(String[] args) {
        //類別與物件(Java最核心的部分)，當瞭解後，即進入物件導向程式設計(Object Oriented Programming, OOP)
        /*
            物件導向特色:
            封裝(Encapsulation)
            抽象(Abstraction)
            繼承(inheritance)
            多型(Polymorphism)
         */

        /*
        狗是物件
            -特性(名詞):名字、年齡、顏色，a.k.a. 屬性(attribute)或欄位(fields)
            -行為(動詞):睡覺、吃、跑 a.k.a.方法(method)
         */
        int x;
        Dog dog = new Dog(); // 宣告與建立物件
        dog.name = "eggCase";
        dog.age = 5;
        dog.color = "gold";

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.color);

        dog.sleep();

    }
}
