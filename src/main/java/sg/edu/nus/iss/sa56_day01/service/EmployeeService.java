package sg.edu.nus.iss.sa56_day01.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import sg.edu.nus.iss.sa56_day01.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeService(){

        employees.add(new Employee("1", "Htet", "Aung"));
        employees.add(new Employee("2", "Myo", "Lwin"));
        employees.add(new Employee("3", "Lin", "Kyaw"));
    }

    public List<Employee> getAllEmployees(){
        return this.employees;
    }

    public List<Employee> getEmpByLastName(String lastName){
         return employees.stream().filter(emp->emp.getLastName().equals(lastName)).toList();
    }
}
