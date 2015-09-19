
package lab4;
import java.util.*;
class Box {
    double length,breadth,depth;
    Box(double length,double breadth,double depth){
        this.length=length;
        this.breadth=breadth;
        this.depth=depth;
    }
    public double volume(){
        return length*breadth*depth;
    }
}
public class BoxDemo{
    public static void main(String[] args) {
        double length,breadth,depth;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        length=sc.nextDouble();
        System.out.println("Enter breadth");
        breadth=sc.nextDouble();
        System.out.println("Enter depth");
        depth=sc.nextDouble();
        Box box=new Box(length,breadth,depth);
        System.out.println("Volume: "+box.volume());
        }
}
