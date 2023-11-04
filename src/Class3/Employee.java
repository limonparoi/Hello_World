package Class3;

public class Employee {
    long id;
    String name;
    String designation;
    double salary;

        public Employee(){

    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public  double getBonus(){
            return salary* .50;
    }
}
