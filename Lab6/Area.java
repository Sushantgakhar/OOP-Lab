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
abstract class Figure{
    abstract void area();
}
class Rectangle extends Figure{
    double length,breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void area(){
        System.out.println("Area of rectangle: "+length*breadth);
    }
}
class Circle extends Figure{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("Area of circle: "+3.14*radius*radius);
    }
}
public class Area {

    public static void main(String[] args) {
        double length,breadth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle: ");
        length=sc.nextDouble();
        Circle c=new Circle(length);
        c.area();
        System.out.println("Enter Length: ");
        length=sc.nextDouble();
        System.out.println("Enter Breadth: ");
        breadth=sc.nextDouble();
        Rectangle r=new Rectangle(length,breadth);
        r.area();
    }
    
}
