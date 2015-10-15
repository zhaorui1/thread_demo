/**
 * Created by zhaorui on 15/10/15.
 */
public class Account {
    private String accountNo;
    private double balance;

    public Account() {

    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public synchronized void draw(double drawAmount){
        if (this.getBalance() >= drawAmount) {

            System.out.println(Thread.currentThread().getName() + "取钱成功！取出：" + String.valueOf(drawAmount));
            this.setBalance(this.getBalance() - drawAmount);
            System.out.println("余额是："+ this.getBalance());
        }
        else {
            System.out.println(Thread.currentThread().getName()+"余额不足。");
        }
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
