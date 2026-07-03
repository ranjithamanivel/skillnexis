public class Student {
     //Create a class with attributes and methods to display student info.

     int id;
     String name;
     double marks;
     public Student(){}

     public Student(int id, String name, double marks) {
        this.id=id;
        this.name=name;
        this.marks = marks;
     }

     public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
     }

     public static void main(String[] args) {
        Student s=new Student();
        s.id=1;
        s.name="Ranjitha";
        s.marks=500;

        s.display();
     }

    
}
