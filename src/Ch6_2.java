class TaiwanBank{
    int account;
    int balance;

    void saveMoney(int save){
        balance = balance + save;
    }
    void printInfo(){
        System.out.println("account:" + account + " balance:" + balance);
    }
}


public class Ch6_2 {
    public static void main(String[] args) {
        TaiwanBank taiwanBank = new TaiwanBank();
        taiwanBank.account = 100001;//設定帳號
        taiwanBank.balance = 0;     //初始化存款0

        taiwanBank.printInfo();     //存款前
        taiwanBank.saveMoney(1000); //存款
        taiwanBank.printInfo();     //存款後
    }
}

//(可以自己寫提款！)
