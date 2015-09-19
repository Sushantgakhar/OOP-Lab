
package lab4;
import java.util.*;

class Employee {
    String name,city;
    double basic,da,hra,salary;
    public void getdata(String name,String city,double basic,double da,double hra){
        this.name=name;
        this.city=city;
        this.basic=basic;
        this.da=da;
        this.hra=hra;
    }
    public void calculate(){
        salary=basic+basic*da/100+basic*hra/100;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Basic Salary: "+basic);
        System.out.println("DA%: "+da);
        System.out.println("HRA%: "+hra);
        System.out.println("Total Salary: "+salary);
    }
}
public class EmployeeDetail{
    public static void main(String args[]){   
        Employee emp=new Employee();
        Scanner sc=new Scanner (System.in);
        String name,city;
        double basic,da,hra;
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter City");
        city=sc.next();
        System.out.println("Enter Basic Salary");
        basic=sc.nextDouble();
        System.out.println("Enter DA%");
        da=sc.nextDouble();
        System.out.println("Enter HRA%");
        hra=sc.nextDouble();
        emp.getdata(name, city, basic, da, hra);
        emp.calculate();
        emp.display();
    }
    
}
 
