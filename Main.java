abstract class Draw{
    abstract void shape();
    void color(){
        System.out.println("Color is Red");
    }
}
 class Circle extends Draw{
    void shape(){
        System.out.println("Circle");
    }
}
 class Square extends Draw{
    void shape(){
        System.out.println("Square");
    }
}
public class Main{
    public static void main(String[] args){
        Circle c = new Circle();
        Square s = new Square();
        c.color();
        c.shape();
        s.color();
        s.shape();

    }
}