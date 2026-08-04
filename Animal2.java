class Animal2{
    void sound(){
        System.out.println("Animal Sound");
    }
    public static void main(String[] args){
        Dog2 d = new Dog2();
        d.sound();

    }
}
class Dog2 extends Animal2{
    void sound(){
        super.sound();
        System.out.println("Dog Barking");
    }
    
}