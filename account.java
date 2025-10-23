public class account {
    private long balance;

    public account() {}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws insuffcientexception{
        if (balance < money){
            throw new insuffcientexception("잔고가 부족합니다. " + (money - balance) + "모자람");
        }
        balance -= money;
    }
}
