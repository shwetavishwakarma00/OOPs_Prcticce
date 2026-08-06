class Vehicle2{
    Vehicle2(){
        System.out.println("vehicle created");
    }
    public static void main(String[] args) {
        Car c = new Car();
    
    }
}
class Car extends Vehicle2{
     Car(){
        super();
        System.out.println("Car created");
    }
    
   }
