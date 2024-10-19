class LMath{
    int x;

    void add(int a){
        x = a;
    }

    //錯誤overload
    // int add(int a){
//        x = a;
//        return x;
//    }

    void add(int a, int b){
        x = a + b;
    }
    void add(int a, int b,int c){
        x = a + b + c;
    }
    void printInfo(){
        System.out.println(x);
    }

}
public class Ch7_5 {
    public static void main(String[] args) {
        //多重定義(overload)***:
        // 1.相同的名字，可以不同的參數數量
        // 2.相同的名字，資料型態可以不一樣
        // 多重定義也可以在一般方法上
        LMath s1 = new LMath();
        s1.add(5);
        s1.printInfo();
        s1.add(5,10);
        s1.printInfo();
        s1.add(5,10,15);
        s1.printInfo();


    }
}
