class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        d.sound();
        a.sound();
    }
    
}
class Dog extends Animal{
@Override
    void sound(){
        System.out.println("Dog Sound");
    }  

    
}