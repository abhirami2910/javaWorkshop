public class File3{
    public int add(int num1,int num2){
        int num=num1+num2;
        System.out.println(num);
        return num;
    }
    public static void main(String args[]){
        File3 obj=new File3();
        int c=obj.add(10,20);
        System.out.println(c);
    }
    }
    