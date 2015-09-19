/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Bank1{
    int getRateOfInterest(){
        System.out.println("Bank Interest:");
        return 0;
    }
}
class SBI extends Bank1{
    @Override
    int getRateOfInterest(){
        System.out.println("SBI Interest:");
        return 8;
    }
}
class ICICI extends Bank1{
    @Override
    int getRateOfInterest(){
        System.out.println("ICICI Interest:");
        return 7;
    }
}
class Axis extends Bank1{
    @Override
    int getRateOfInterest(){
        System.out.println("Axis Interest:");
        return 9;
    }
}

public class Banks {
    public static void main(String Args[]){
        Bank1 bank=new Bank1();
        int interest;
        interest=bank.getRateOfInterest();
        System.out.println(interest);
        SBI sbi=new SBI();
        bank=sbi;
        interest=bank.getRateOfInterest();
        System.out.println(interest);
        ICICI icici=new ICICI();
        bank=icici;
        interest=bank.getRateOfInterest();
        System.out.println(interest);
        Axis axis=new Axis();
        bank=axis;
        interest=bank.getRateOfInterest();
        System.out.println(interest);
       
    }
}
