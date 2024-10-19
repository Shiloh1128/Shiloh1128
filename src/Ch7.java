class KeelungBank{
    int account;
    int balance;
    //這邊沒有建構方法，其實Java會在編譯時會自動幫忙建立預設建構方法***
    //會長成如下:
    //KeelungBank(){
    //}
}

public class Ch7 {
    public static void main(String[] args) {
        //這是不好的方法
        //好的方法應該可以自行完成初始化的工作--> 建構方法
        //TaipeiBank taipeiBank = new TaipeiBank(); //宣告與創建 建在heap上
        //taipeiBank.account = 100001;//設定帳號
        //taipeiBank.balance = 0;     //初始化存款0

        KeelungBank keelungBank = new KeelungBank();
        //建構方法 (constructor)
    }
}
