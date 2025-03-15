import java.util.*;
public class Demo{
     public void calculateGrade(int mark){
        if(mark>=90)
        {
            System.out.println("grade is A");
        }
        else if(mark>=75){
            System.out.println("grade is B");
        }
        else if(mark>=50){
            System.out.println("grade is C");
        }
        else{
            System.out.println("grade is F");
        }
     }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Mark:");
            int mark1=sc.nextInt();
            Demo obj=new Demo();
            obj.calculateGrade(mark1);
        }
     }

}