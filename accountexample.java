public class accountexample {
    public static void main(String[] args){
        account account = new account();

        //예금
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        //출금
        try {
            account.withdraw(30000);
        }catch (insuffcientexception e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
