/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

class Number{
    double d;
    Number(double d){
        this.d=d;
    }
    boolean isZero(){
        if(d==0)
            return true;
        else
            return false;
    }
    boolean isPositive(){
        if(d>0)
            return true;
        else
            return false;
    }
    boolean isNegative(){
        if(d<0)
            return true;
        else
            return false;
    }
    boolean isOdd(){
        if((int)d!=d)
            return false;
        else if(d%2!=0)
            return true;
        else
            return false;
    }
    boolean isEven(){
        if((int)d!=d)
            return false;
        if(d%2==0)
            return true;
        else
            return false;
    }
    boolean isPrime(){
        boolean flag=true;
        if((int)d!=d)
            return false;
        else if(d<0)
            return false;
        for(int j=2;j<=(d/2);j++)
        {
            if(d%j==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    boolean isArmstrong()
    {
        if((int)d!=d)
            return false;
        else if(d<0)
            return false;
        double d1=d;
        double sum=0;
        while(d!=0){
            sum+=(Math.pow((d%10),3));
            d=(int)d/10;
        }
        if(d1==sum)
            return true;
        else
            return false;
    }
}
public class NumberClass {
    public static void main(String args[]){
        double d;
        System.out.println("Enter Double");
        Scanner sc=new Scanner(System.in);
        d=sc.nextDouble();
        Number num=new Number(d);
        System.out.println("Is Zero: "+num.isZero());
        System.out.println("Is Positive: "+num.isPositive());
        System.out.println("Is Negative: "+num.isNegative());
        System.out.println("Is Odd: "+num.isOdd());
        System.out.println("Is Even: "+num.isEven());
        System.out.println("Is Prime: "+num.isPrime());
        System.out.println("Is Armstrong: "+num.isArmstrong());
    }
}
