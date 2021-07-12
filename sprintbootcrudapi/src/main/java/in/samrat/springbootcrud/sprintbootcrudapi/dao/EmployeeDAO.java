package in.samrat.springbootcrud.sprintbootcrudapi.dao;

import java.util.List;

import in.samrat.springbootcrud.sprintbootcrudapi.model.Employee;

public interface EmployeeDAO {
    
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
