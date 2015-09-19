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
interface Figure3{
    abstract void area();
}
class Triangle1 implements Figure3{
    double base,height;
    Triangle1(double base,double height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        System.out.println("Area of triangle: "+0.5*base*height);
    }
}
class Square1 implements Figure3{
    double side;
    Square1(double side){
        this.side=side;
    }
    public void area(){
        System.out.println("Area of square: "+side*side);
    }
}
public class AreaAddI {

    public static void main(String[] args) {
        double side,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square: ");
        side=sc.nextDouble();
        Square1 c=new Square1(side);
        c.area();
        System.out.println("Enter Length: ");
        side=sc.nextDouble();
        System.out.println("Enter Breadth: ");
        height=sc.nextDouble();
        Triangle1 r=new Triangle1(side,height);
        r.area();
    }
    
}
