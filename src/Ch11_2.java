//abstract class Car

abstract class Car{
    abstract void drive();
}

class Honda extends Car{
    void drive(){
        System.out.println("i am Honda");
    }
}


public class Ch11_2 {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.drive();

    }
}
