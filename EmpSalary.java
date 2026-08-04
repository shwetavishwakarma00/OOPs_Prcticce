class EmpSalary{
    double basicSalary;
    String name;
    EmpSalary(double basicSalary, String name){
        this.basicSalary = basicSalary;
        this.name = name;
    } 
    void calculateSalary(){
        double bonus = basicSalary * 0.2;
        double totalSalary = basicSalary + bonus;
        System.out.println("Employee Name: " + name);
        System.out.println("Total Salary: " + totalSalary);
    }
    public static void main(String[] args){
        EmpSalary emp1 = new EmpSalary(50000, "Shweta");
        emp1.calculateSalary();
        EmpSalary emp2 = new EmpSalary(90000, "Jhon");
        emp2.calculateSalary();
        EmpSalary emp3 = new EmpSalary(100000, "Rahul");
        emp3.calculateSalary();
    }
}