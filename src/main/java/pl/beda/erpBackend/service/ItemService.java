package pl.beda.erpBackend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.beda.erpBackend.dto.ItemSaveDto;
import pl.beda.erpBackend.entity.Item;
import pl.beda.erpBackend.entity.QuantityType;
import pl.beda.erpBackend.entity.Warehouse;
import pl.beda.erpBackend.repository.ItemRepository;
import pl.beda.erpBackend.repository.QuantityTypeRepository;
import pl.beda.erpBackend.repository.WarehouseRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final WarehouseRepository warehouseRepository;
    private final QuantityTypeRepository quantityTypeRepository;


    public Item saveItem(ItemSaveDto dto) {
        Optional<Warehouse> warehouseOptional = warehouseRepository.findById(dto.getIdWarehouse());
        Optional<QuantityType> quantityTypeOptional = quantityTypeRepository.findById(dto.getIdQuantityType());
        if (!warehouseOptional.isPresent() || !quantityTypeOptional.isPresent()) {
            throw new RuntimeException("Incorrect identifiers: id:warehouse: "
                    + dto.getIdWarehouse() + ", idQuantityType:" + dto.getIdQuantityType());
        }

        Warehouse warehouse = warehouseOptional.get();
        QuantityType quantityType = quantityTypeOptional.get();
        Item item = Item.of(dto);
        item.setQuantityType(quantityType);
        item.setWarehouse(warehouse);
        return itemRepository.save(item);
    }

}
