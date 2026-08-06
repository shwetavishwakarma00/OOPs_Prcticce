class Person{
    String name;
    int age;
    void displayPerson(String name, int age){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    public static void main(String[] args) {
        Person p = new Person();
        Employee emp = new Employee();
        p.displayPerson("Shweta", 22);
        emp.displayEmp(200000.0, "Google");
    }
}
class Employee extends Person{
    double salary;
    String company;
    void displayEmp(double salary, String company){
        System.out.println("Salary : " + salary);
        System.out.println("Company : " + company);
    }
}