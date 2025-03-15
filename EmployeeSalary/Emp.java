import java.util.*;
class Employee
{
    int CalculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the slary:");
        int basesalary=sc.nextInt();
        return basesalary;
        
    }
}
    class Manager extends Employee
    {
        void get()
        {
            int basesalary=CalculateSalary();
            double a=basesalary*0.2;
            double b=basesalary+a;
            System.out.println("The salary is:"+b);
        }
        
    }
    class Developer extends Employee
    {
        void display()
        {
            int basesalary=CalculateSalary();
            double c=basesalary*0.1;
            double d=basesalary+c;
            System.out.println("The salary is:"+d);
        }
        
    }
    public class Emp
    {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("\n1.Developer\n2.Manager");
        System.out.println("Enter the choice:");
        int i=sc.nextInt();
        if(i==1)
        {
        Manager a=new Manager();
        a.get();
        }
        else
         if(i==2)
        {
        Developer b=new Developer();
        b.display();
        }
        i=i+1;
        }
    }
    }
