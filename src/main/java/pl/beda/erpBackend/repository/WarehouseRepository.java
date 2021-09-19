package pl.beda.erpBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.beda.erpBackend.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
