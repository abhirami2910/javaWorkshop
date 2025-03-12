public class File{
    public int add(int num1,int num2){
        int num=num1+num2;
        return num;
    }
    public int sub(int num1,int num2){
        int num=num1-num2;
        return num;
    }
    public int multiply(int num1,int num2){
        int num=num1*num2;
        return num;
    }
    public int divide(int num1,int num2){
        int num=num1/num2;
        return num;
    }
 public static void main(String args[]){
    File obj=new File();
    int c=obj.add(56,75);
    int d=obj.sub(78,43);
    int a=obj.multiply(73,23);
    int x=obj.divide(56,34);
    System.out.println(c);
    System.out.println(d);
    System.out.println(a);
    System.out.println(x);
 }
 }


