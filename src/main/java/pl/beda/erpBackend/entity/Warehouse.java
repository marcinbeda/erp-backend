package pl.beda.erpBackend.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWarehouse;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouse")
    private List<Item> items;

}
