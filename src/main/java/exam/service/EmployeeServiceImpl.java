package exam.service;

import exam.entity.EmployeeEntity;
import exam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo productRepo;

    @Override
    public List<EmployeeEntity> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Page<List<EmployeeEntity>> findAllByName(String name, Pageable pageable) {
        return productRepo.findAllByName(name, pageable);
    }

    @Override
    public EmployeeEntity saveProduct(EmployeeEntity employeeEntity) {
        return productRepo.save(employeeEntity);
    }

    @Override
    public EmployeeEntity getById(int id) {
        return productRepo.getOne(id);
    }

    @Override
    public EmployeeEntity save(EmployeeEntity employeeEntity) {
        productRepo.save(employeeEntity);
        return null;
    }

    @Override
    public EmployeeEntity delete(EmployeeEntity employeeEntity) {
        productRepo.delete(employeeEntity);
        return null;
    }

    public void handlerData() {

    }
}
