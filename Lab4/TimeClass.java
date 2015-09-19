/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
class Time{
    int hr,min,sec;
    Time(){
        hr=0;
        min=0;
        sec=0;
    }
    Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    public Time add(Time t1,Time t2){
        Time t3=new Time();
        t3.hr=t1.hr+t2.hr;
        t3.min=t1.min+t2.min;
        t3.sec=t1.sec+t2.sec;
        if(t3.sec>=60){
            t3.sec-=60;
            t3.min++;
        }
        if(t3.min>=60){
            t3.min-=60;
            t3.hr++;
        }
        return t3;
    }
    public void display(){
        System.out.println("Time: "+hr+":"+min+":"+sec);
    }
}
public class TimeClass {
    public static void main(String args[]){
        Time t1=new Time();
        Time t2=new Time(2,54,16);
        Time t3=new Time();
        System.out.println("Default Time");
        t1.display();
        System.out.println("Fixed Time");
        t2.display();
        t3=t3.add(t1, t2);
        System.out.println("Added Time");
        t3.display();
    }
}
