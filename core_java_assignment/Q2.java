public class Q2 {
    public static void main(String args[]) {
         Account acc = new Account();
         acc.setAccountNo("1234567890");
         acc.setAccountHolderName("Devraj Jain");
         acc.setAccountType("saving");
         acc.setBalance(20000.00);
        
         System.out.println("Account Holder: " + acc.getAccountHolderName());
         System.out.println("Account number: " + acc.getAccountNo());
         System.out.println("Type: " + acc.getAccountType());
         System.out.println("Balance: " + acc.getBalance());

    }
}

class Account {
    private double balance;
    private String accountHolderName;
    private String accountType;
    private String accountNo;

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

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}