package unified_modeling_language_uml;

import java.util.Arrays;
import java.util.List;

class Professor {

    private String name;

    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


class Department {

    private String name;

    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors(){
        System.out.println("Department : " + name);
        for (Professor professor : professors) {
            System.out.println(professor.getName());
        }
    }

}


public class AggregationExample {
    public static void main(String[] args) {
        // Aggregation: A weaker form of association where one object contains another, but they can exist independently.
        //
        // Aggregation is a weak "has-a" relationship where one class contains objects of another class. However, the contained
        // objects can exist independently of the container object.

        Professor professor1 = new Professor("ajay");
        Professor professor2 = new Professor("ramkumar");
        List<Professor> professors = Arrays.asList(professor1, professor2);

        // Aggregation: relationship: department has professors, but professors exist independently
        Department automobile = new Department("automobile", professors);
        automobile.showProfessors();
    }
}
