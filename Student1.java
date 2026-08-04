class Student1{
    String name;
    int age;
    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        Student1 s = new Student1("John", 20);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}