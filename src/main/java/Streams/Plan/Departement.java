package Streams.Plan;

import java.util.ArrayList;
import java.util.List;

public class Departement{
    private List<Employee> employees;
    private String name;

    public Departement(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}