package pro.sky.java.course2.homework_2_8;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName, int salary, int department);
    Employee removeEmployee(String firstName, String lastName);
    Employee findEmployee(String firstName, String lastName);
    Employee getLowestPaidEmployee(int department);
    Employee getHighestPaidEmployee(int department);
    List<Employee> printEmployeesForDepartment(int department);
    List<Employee> printEmployeesByDepartments();
    List<Employee> printEmployees();
}