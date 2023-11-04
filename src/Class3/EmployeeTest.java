package Class3;



public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Leemon";
        employee.id = 5656;
        employee.designation = "SQAE";
        employee.salary =352352345.25f;
        System.out.println(employee.getBonus());

    }
}
