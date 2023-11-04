package Class3;

import java.util.EnumMap;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Leemon";
        employee.id = 9905656l;
        employee.designation = "SQAE";
        employee.salary =352352345.25f;
        System.out.println(employee.getBonus());

    }
}
