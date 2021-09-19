package pl.beda.erpBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.beda.erpBackend.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
}
