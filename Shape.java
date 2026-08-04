abstract class Shape{
    abstract void draw();
    public static void main(String[] args){
        Shape s = new Circle();
        s.draw();
    }

}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }

}