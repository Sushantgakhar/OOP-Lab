/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and op en the template in the editor.
 */
import java.util.Scanner;
class StudentDet{
    long regno;
    String Name;
    int age;
    StudentDet(long regno,String Name,int age){
        this.regno=regno;
        this.Name=Name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name: "+Name);
        System.out.println("RegNo: "+regno);
        System.out.println("Age: "+age);
    }
}
class PG extends StudentDet{
    int sem,fees;
    PG(long regno,String Name,int age,int sem,int fees){
        super(regno,Name,age);
        this.sem=sem;
        this.fees=fees;
    }
    public void display(){
        super.display();
        System.out.println("Semester: "+sem);
        System.out.println("Fees "+fees);
    }
}
class UG extends StudentDet{
    int sem,fees;
    UG(long regno,String Name,int age,int sem,int fees){
        super(regno,Name,age);
        this.sem=sem;
        this.fees=fees;
    }
    public void display(){
        super.display();
        System.out.println("Semester: "+sem);
        System.out.println("Fees "+fees);
    }
}
public class Student {
    public static void main(String Args[]){
        PG pg = new PG(1234567,"Anuraag",19,3,75000);
        pg.display();
        UG ug = new UG(7637659,"Ram",25,5,175000);
        ug.display();
    }
}
