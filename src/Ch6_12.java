class ShadowName{
    int i = 10;
    void printInfo(int i){
        System.out.println("區域變數" + i);
        //因為有相同變數名稱，所以會發生名稱遮罩的問題(shadowing of the name) ***
        //System.out.println("成員屬性" + i);
        System.out.println("成員屬性" + this.i);
    }
}

public class Ch6_12 {
    public static void main(String[] args) {
        ShadowName shadowName = new ShadowName();
        shadowName.printInfo(30);
    }
}
