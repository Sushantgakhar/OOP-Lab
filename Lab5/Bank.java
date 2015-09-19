import java.util.Scanner;
/**
 *
 * @author student
 */
class Account {

    String Name=new String();
    long accno;
    char type;
    Account(){
        Name="";
        accno=0;
        type='x';
    }
    Account(String Name,long accno,char type) {
        this.Name=Name;
        this.accno=accno;
        this.type=type;
    }
    
}
class Savings extends Account{
    int balance;
    Savings(){
        super();
        balance=0;
    }
    Savings(String name,long accno,char type,int balance){
        super(name,accno,type);
        this.balance=balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public int dispbal(){
        return balance;
    }
    public void interest(){
        int si=(balance*5)/100;
        balance+=si;
    }
    public void withdraw(int amount){
        if(balance>=amount&&balance>=500)
            balance-=amount;
        else
            System.out.println("Balance Insufficient");
    }
    public void checkmin(){
        if(balance<500)
            System.out.println("Balance Low,please deposit");
        else
            System.out.println("Balance sufficient");;
    }
    
}
class Current extends Account{
    int balance;
    Current(){
        super();
        balance=0;
    }
    Current(String name,long accno,char type,int balance){
        super(name,accno,type);
        this.balance=balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public int dispbal(){
        return balance;
    }
    public void withdraw(int amount){
        if(balance>=amount&&balance>=500)
            balance-=amount;
        else
            System.out.println("Balance Insufficient");
    }
    public void checkmin(){
        if(balance<500){
            System.out.println("Balance is low, Service Tax will be levied");
            balance-=(0.01*500);
        }
        else
            System.out.println("Balance sufficient");
    }
}
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name;
        Current c=new Current();
        Savings s=new Savings();
        long accno;
        char type;
        int balance,ch,amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        Name=sc.next();
        System.out.println("Enter AccNo.");
        accno=sc.nextLong();
        System.out.println("Enter Type(S/C)");
        type=sc.next().charAt(0);
        System.out.println("Enter Balance");
        balance=sc.nextInt();
        if(type=='C')
            c=new Current(Name,accno,type,balance);
        else
            s=new Savings(Name,accno,type,balance);
        do{
            System.out.println("1.Deposit 2.Display Balance 3.Deposit Interest 4.Withdraw 5.Check Minimum 6.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Amount");
                    amount=sc.nextInt();
                    if(type=='C')
                        c.deposit(amount);
                    else
                        s.deposit(amount);
                    break;
                case 2:
                    System.out.print("Balance: ");
                    if(type=='C')
                        System.out.println(c.dispbal());
                    else
                        System.out.println(s.dispbal());
                    break;
                case 3:
                    if(type=='C')
                        System.out.println("No Interest for this type");
                    else
                        s.interest();
                    break;
                case 4:
                    System.out.println("Enter Amount");
                    amount=sc.nextInt();
                    if(type=='C')
                        c.withdraw(amount);
                    else
                        s.withdraw(amount);
                    break;
                case 5:
                    if(type=='C')
                        c.checkmin();
                    else
                        s.checkmin();
                    break;
            }
        }while(ch!=6);
    }    
}
