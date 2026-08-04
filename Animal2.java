class Animal2{
    void sound(){
        System.out.println("Animal Sound");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
        
    }
}
class Dog extends Animal2{
    void sound(){
        super.sound();
        System.out.println("Dog Barking");
    }
    
}