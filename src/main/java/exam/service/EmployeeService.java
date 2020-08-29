package exam.service;

import exam.entity.EmployeeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> getAll();
    Page<List<EmployeeEntity>> findAllByName(String name, Pageable pageable);
    EmployeeEntity saveProduct(EmployeeEntity employeeEntity);
    EmployeeEntity getById(int id);
    EmployeeEntity save(EmployeeEntity employeeEntity);
    EmployeeEntity delete(EmployeeEntity employeeEntity);
}
