//static 靜態：不需要去建物件(不需要實體(instance))

class Person{
    int age;
    String name;

    void printInfo(){
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }
}

public class Ch7_14 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bunny";
        p1.age = 30;

        Person p2 = new Person();
        p2.name = "Ken";
        p2.age = 24;

        p1.printInfo();
        p2.printInfo();

    }
}
