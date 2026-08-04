class Student{
    String name;
    int rollno;
    String course;
    Student(String name, int rollno, String course){
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }
    public static void main(String[] args){
        Student s1 = new Student("John", 101, "Computer Science");
        s1.display();
        Student s2 = new Student("Jane", 102, "Mathematics");
        s2.display();
    }
}