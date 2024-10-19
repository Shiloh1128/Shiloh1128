class HsinchuBank{
    private String name;
    private int balance;
    HsinchuBank(String name){
        this.name = name;
        this.balance = 0;
    }
    void saveMoney(int money){
        this.balance += money;
    }
    void withdrawMoney(int money){
        this.balance -= money;
    }
    void printInfo(){
        System.out.println(name + "的目前餘額是多少=" + balance);
    }
}

public class Ch7_13 {
    public static void main(String[] args) {
        HsinchuBank hB = new HsinchuBank("Chen");
        hB.printInfo();
        hB.saveMoney(1000);
        hB.printInfo();
        hB.withdrawMoney(400);
        hB.printInfo();

    }
}
