/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.*;
interface Comp{
    int sales(int sm1,int sm2,int sm3);
}
class Hardware implements Comp{
    String manufacturer,category;
    Hardware(String manufacturer,String category){
        this.manufacturer=manufacturer;
        this.category=category;
    }
    @Override
    public int sales(int sm1,int sm2, int sm3){
        return(sm1+sm3+sm2); 
    }
}
class Software implements Comp{
    String os,type;
    Software(String os,String type){
        this.os=os;
        this.type=type;
    }
    @Override
    public int sales(int sm1,int sm2, int sm3){
        return(sm1+sm3+sm2); 
    }
}
public class Company {
    public static void main(String args[]){
        String manufacturer,category,os,type;
        int sm1,sm2,sm3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter OS:");
        os=sc.next();
        System.out.println("Enter Type:");
        type=sc.next();
        Software s=new Software(os,type);
        System.out.println("Enter Manufacturer:");
        manufacturer=sc.next();
        System.out.println("Enter Category:");
        category=sc.next();
        Hardware h=new Hardware(manufacturer,category);
        System.out.println("Enter hardware sales for 3 months:");
        sm1=sc.nextInt();
        sm2=sc.nextInt();
        sm3=sc.nextInt();
        int hs=h.sales(sm1,sm2,sm3);
        System.out.println("Hardware Sales: "+hs);
        System.out.println("Enter software sales for 3 months:");
        sm1=sc.nextInt();
        sm2=sc.nextInt();
        sm3=sc.nextInt();
        int ss=s.sales(sm1,sm2,sm3);
        System.out.println("Software Sales: "+ss);
        System.out.println("Total Sales: "+(hs+ss));
    }
}
