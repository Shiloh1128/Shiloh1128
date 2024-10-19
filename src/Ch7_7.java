class AMath{
    int math(int x,int y){
        return x * y;
    }
    //錯的例子，因為方法簽章(Method signature) = 名稱 + 參數(型態+數量)
    //double math (int x, int y){
    //    return x * y;
    //}
}

public class Ch7_7 {
    public static void main(String[] args) {
        AMath aMath = new AMath();
        System.out.println(aMath.math(10,10));
    }
}
