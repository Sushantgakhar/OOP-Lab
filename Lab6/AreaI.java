/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author student
 */
interface Figure1{
    abstract void area();
}
class Rectangle1 implements Figure1{
    double length,breadth;
    Rectangle1(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        System.out.println("Area of rectangle: "+length*breadth);
    }
}
class Circle1 implements Figure1{
    double radius;
    Circle1(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of rectangle: "+3.14*radius*radius);
    }
}
public class AreaI {

    public static void main(String[] args) {
        double length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        length=sc.nextDouble();
        Circle1 c=new Circle1(length);
        c.area();
        System.out.println("Enter Length: ");
        length=sc.nextDouble();
        System.out.println("Enter Breadth: ");
        breadth=sc.nextDouble();
        Rectangle1 r=new Rectangle1(length,breadth);
        r.area();
    }
    
}
