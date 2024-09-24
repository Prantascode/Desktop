package JavaTutorial;

public class BankAccount {
    private String name;
    private Double balance;

    public BankAccount(String name,Double balance){
        this.name = name;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public Double getBalance(){
        return balance;
    }
    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        balance -= amount;
    }
    @Override
    public String toString(){
        String farmattedString = String.format(%.2f,Math.abs(balance));
    }
}
