public class File{
    public String Concatenate(String name1,String name2){
        String name=name1+name2;
        return name;
    }
    public static void main(String args[]){
        File obj=new File();
        String a=obj.Concatenate("Abi","vM");
        System.out.println(a);
    }
    }
    