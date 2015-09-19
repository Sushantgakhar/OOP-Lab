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
abstract class Figure2{
    abstract void area();
}
class Triangle extends Figure2{
    double base,height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public void area(){
        System.out.println("Area of rectangle: "+0.5*base*height);
    }
}
class Square extends Figure2{
    double side;
    Square(double side){
        this.side=side;
    }
    public void area(){
        System.out.println("Area of square: "+side*side);
    }
}
public class AreaAdd {

    public static void main(String[] args) {
        double height,base;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of Square: ");
        height=sc.nextDouble();
        Square c=new Square(height);
        c.area();
        System.out.println("Enter Height: ");
        height=sc.nextDouble();
        System.out.println("Enter Base: ");
        base=sc.nextDouble();
        Triangle r=new Triangle(height,base);
        r.area();
    }
    
}
