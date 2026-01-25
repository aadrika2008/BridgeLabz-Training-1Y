class Student {
    int id;
    String name;
    int age;00000

   
    void displayDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
      s1.id = 101;
        s1.name = "Dev";
        s1.age = 20;

       
        s1.displayDetails();
    }
}