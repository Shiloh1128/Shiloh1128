class Player{
    //存取修飾符號access modifier (public, protected, X, private)
    //封裝的private不可以放在建構方法內，原因物件建立時會看不到

    private int age;
    String name;
    Player(int age, String name){
        this.age = age;
        this.name = name;
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Ch7_12 {
    public static void main(String[] args) {
        //封裝(Encapsulation)***** = 資訊隱藏 info. hiding
    /*

                           class  package  subclass  world
    public                  V         V        V       V
    protected               V         V        V       X
    X(no modifier, default) V         V        V       X
    private                 V         X        X       X

     */
        Player player = new Player(30, "Bunny");
        player.printInfo();
        //因為封裝private的關係，所以無法設定age值為10000
        //player.age = 10000;
        //因為封裝default的關係，所以可以設定age值為Caline
        player.name = "Caline";
        player.printInfo();
    }
}
