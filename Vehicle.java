interface Vehicle{
    void start();
    public static void main(String[] args){
        Vehicle v = new Bike();
        v.start();
    }
}
class Bike implements Vehicle{
    @Override
   public void start(){
        System.out.println("Bike Started");
    }
}