class MMath{
    int x;
    String str;

    MMath(int a){
        x = a;
    }

    MMath(String s){
        str = s;
    }

    void add() { System.out.println("x=" + (x));}

}
public class Ch7_4 {
    public static void main(String[] args) {
        //多重定義(overload)***:
        // 1.相同的名字，可以不同的參數數量
        // +2.相同的名字，資料型態可以不一樣
        MMath s1 = new MMath(5);

        MMath s2 = new MMath("Yummy");
    }
}
