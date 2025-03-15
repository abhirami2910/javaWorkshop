class Parent{
    public void add(){
        System.out.println("Hello world");
    }
}
class Child extends Parent{
    void display(){
        add();

    }
}
class Third extends Parent{
    void helper(){
        add();

    }
}
public class Demo{
    public static void main(String args[]){

    Child obj1=new Child();
    obj1.add();
    Third obj=new Third();
    obj.helper();
    }
}