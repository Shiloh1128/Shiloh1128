//static 靜態：不需要去建物件(不需要實體(instance))

class Person3{
    //static 不可亂放
    static int age;  //所有物件共享一份資料
    String name;    //每一個物件都有一份此資料
    Person3(String name){
        this.name = name;
    }

    void printInfo(){
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }
}

public class Ch7_16 {
    public static void main(String[] args) {
        //放在物件前做測試
        Person3.age = 100;
        Person3 p1 = new Person3("Bunny");
        Person3 p2 = new Person3("Ken");

        p1.printInfo();
        p2.printInfo();

        //放在物件後做測試
        Person3.age = 200;
        p1.printInfo();
        p2.printInfo();

    }
}
