package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야 합니다.
        return amount > 0;
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance > amount) {
            balance -= amount;
        } else {
            System.out.println("금액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
