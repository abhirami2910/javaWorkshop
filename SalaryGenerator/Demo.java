import java.util.*;
public class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Profession:");
        String Profession=sc.nextLine();
        System.out.println("Salary:");
        int Salarys=sc.nextInt();
        if(Profession.equals("developer")){
            double Salary=Salarys+Salarys*0.1;
            System.out.println(Salary);

        }
        else if(Profession.equals("manager")){
            double Salary=Salarys+Salarys*0.2;
            System.out.println(Salary);
        }
    }
}