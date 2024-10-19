class Student{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Ch7_11 {
    public static void main(String[] args) {
        Student student = new Student(30,"Bunny");
        student.printInfo();
    }
}
