class MediumMath{
    //其實87趴像物件導向:名詞+動詞+建構方法
    int x, y;

    //我們從外面(main)丟值
    MediumMath(int a, int b){
        x = a;
        y = b;
    }

    void add(){
        System.out.println("加法的結果" + (x + y));
    }

    void sub(){
        System.out.println("減法的結果" + (x - y));
    }
}

public class Ch7_2 {
    public static void main(String[] args) {
        // 物件建立時會自動跑起建構方法*****
        MediumMath mediumMath = new MediumMath(0,0);
        mediumMath.add();
        mediumMath.sub();
    }
}
