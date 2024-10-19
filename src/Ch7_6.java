public class Ch7_6 {
    //多重定義也可以用在main上
    public static void main(String[] args) {
        System.out.println("參數是String[] args");
    }

    public static void main(String args){
        System.out.println("參數是String args");
    }

    public static void main(){
        System.out.println("沒有參數");
    }
}
