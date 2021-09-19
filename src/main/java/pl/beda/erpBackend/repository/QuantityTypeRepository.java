package pl.beda.erpBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.beda.erpBackend.entity.QuantityType;

public interface QuantityTypeRepository extends JpaRepository<QuantityType, Long> {
}
