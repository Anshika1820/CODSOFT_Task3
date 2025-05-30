package atm.pkginterface;

public class ATMInterface {
    private BankAccount account;
    
    public ATMInterface(BankAccount account){
        this.account=account;
    }   
    public boolean withdraw(double amt){
        return account.withdraw(amt);
   }
    public boolean deposit(double amt){
       return account.deposit(amt);
    }
    public double getbalance(){
        return account.getbalance();
    }
 }


