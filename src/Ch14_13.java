interface A{
    void walking();
    default void running(){
        System.out.println("1");
    }
}

interface B extends A{
    void walking();
    default void running(){
        System.out.println("2");
    }
}

class C implements B{
    public void running(){
        System.out.println("3");
    }
}

public class  Ch14_13 {
    public static void main(String[] args) {
        C c = new C();
        c.running();
        c.walking();
    }
}
