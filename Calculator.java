class Calculator{
    void add(int a, int b){
        System.out.println("Addition: " + (a + b));
    }
    void add(double a, double b){
        System.out.println("Addition: " + (a + b));
    }

     public static void main(String[] args){
        Calculator c = new Calculator(); 
        c.add(10, 5);
        c.add(10.5, 20.5);
    }
}
