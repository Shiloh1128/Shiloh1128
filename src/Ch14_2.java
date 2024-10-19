interface A{
    void walking();
    default void running(){
        System.out.println("1");
    }
}

interface B{
    void walking();
    default void running(){
        System.out.println("2");
    }
}

class C{
    public void running(){
        System.out.println("3");
    }
}

class D extends C implements A, B{
    public void walking(){
        System.out.println("4");
        A.super.running();// 我要A的running
        B.super.running();// 我要B的running
    }
}
//類別優先
public class Ch14_2 {
    public static void main(String[] args) {
        D d = new D();
        d.running();
        d.walking();
    }
}
