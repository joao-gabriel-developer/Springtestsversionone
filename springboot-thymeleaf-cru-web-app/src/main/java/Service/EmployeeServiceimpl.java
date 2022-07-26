package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Employee;
import Repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
}
