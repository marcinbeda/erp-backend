package pl.beda.erpBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.beda.erpBackend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
