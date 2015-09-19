/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

class Complex{
    int real,img;
    Complex(){
        real=0;
        img=0;
    }
    Complex(int r,int i){
        real=r;
        img=i;
    }
    public Complex add(int num,Complex c1){
        Complex c2=new Complex();
        c2.real=num+c1.real;
        c2.img=c1.img;
        return c2;
    }
    public Complex add(Complex c1, Complex c2){
        Complex c=new Complex();
        c.real=c2.real+c1.real;
        c.img=c1.img+c2.img;
        return c;
    }
    public void display(){
        System.out.println(real+"+"+"("+img+"i)");
    }
}
public class ComplexClass {
    public static void main(String args[]){
        int real,img,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complex Number");
        real=sc.nextInt();
        img=sc.nextInt();
        Complex c1=new Complex(real,img);
        System.out.println("Enter Complex Number");
        real=sc.nextInt();
        img=sc.nextInt();
        Complex c2=new Complex(real,img);
        System.out.println("Enter Integer");
        num=sc.nextInt();
        Complex c=new Complex();
        c=c.add(num,c1);
        System.out.println("Adding Integer & Complex Number");
        c.display();
        c=c.add(c1,c2);
        System.out.println("Adding Complex Numbers");
        c.display();
        
    }
}
