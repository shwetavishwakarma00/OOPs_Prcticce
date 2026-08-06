abstract class Shape{
    int length;
    int breadth;
    double pi = 3.14;
    int r;
    abstract void area();
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 12;
        r.area();
        Circle c = new Circle();
        c.r = 7;
        c.area();

    }
}
class Rectangle extends Shape{
  public void area(){
    int react = length * breadth;
    System.out.println("Reactangle : " + react);
  }

}   
class Circle extends Shape{
  public void area(){
    double circle = pi * r * r;
    System.out.println("Reactangle : " + circle);
  }

}