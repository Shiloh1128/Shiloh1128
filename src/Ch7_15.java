//static 靜態：不需要去建物件(不需要實體(instance))

class Person2{
    //static 不可亂放
    int age;        //所有物件共享一份資料
    String name;    //每一個物件都有一份此資料
    Person2(String name){
        this.name = name;
    }

    void printInfo(){
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }
}

public class Ch7_15 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("penny");
        p1.name = "Bunny";
        p1.age = 30;

        Person2 p2 = new Person2("kent");
        p2.name = "Ken";
        p2.age = 24;

        p1.printInfo();
        p2.printInfo();

    }
}
