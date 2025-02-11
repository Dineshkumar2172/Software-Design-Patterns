package unified_modeling_language_uml;

class Teacher {
    
    private String name;

    public Teacher(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void teach(Student student){
        System.out.println(name + " is teaching " + student.getName());
    }
}

class Student {

    private String name;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class AssociationExample {
    public static void main(String[] args) {

        // Association - A relationship between two classes that represents interactions between objects.
        //
        // Association represents a relationship between two or more classes. In this case, each object in
        // one class is associated with one or more objects of another class.

        Student student = new Student("Harish");
        Teacher teacher = new Teacher("Mohan");

        // Association between teachers and student
        teacher.teach(student);
    }
}
