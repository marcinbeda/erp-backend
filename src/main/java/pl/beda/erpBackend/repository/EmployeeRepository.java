package pl.beda.erpBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.beda.erpBackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
