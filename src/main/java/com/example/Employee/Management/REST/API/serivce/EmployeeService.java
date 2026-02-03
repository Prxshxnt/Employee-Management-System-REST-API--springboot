package com.example.Employee.Management.REST.API.serivce;

import com.example.Employee.Management.REST.API.entity.Employee;
import com.example.Employee.Management.REST.API.exception.ResourceNotFoundException;
import com.example.Employee.Management.REST.API.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Page<Employee> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }

    public Employee getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));
    }

    public Employee update(Long id, Employee employee) {
        Employee existing = getById(id);
        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setDepartment(employee.getDepartment());
        existing.setSalary(employee.getSalary());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.delete(getById(id));
    }

    public Page<Employee> search(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return repository.findByNameContainingIgnoreCase(name, pageable);
    }
}
