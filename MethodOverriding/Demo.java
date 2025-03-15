class parent{
    void display(){
        System.out.println("Hello");
    }
}
class child{
    void display(){
        System.out.println("Home");
    }
}
public class Demo{
    public static void main(String args[]){
        child obj=new child();
        obj.display();
    }
}