class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        System.out.println("employee name: " + name);
        System.out.println("employee salary: " + salary);
    }
    public static void main(String[] args){
        Employee e = new Employee("shweta", 20000);
    }
}