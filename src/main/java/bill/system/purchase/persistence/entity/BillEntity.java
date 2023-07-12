package bill.system.purchase.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "factura")
public class BillEntity {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroFactura", nullable = false, unique = true)
    private Integer billNumber;
    /**
     *
     */
    @Column(name = "fecha")
    private Timestamp date;
    /**
     *
     */
    @Column(name = "total")
    private Double total;
    /**
     *
     */
    @Column(name = "iva")
    private Double taxes;

    @OneToMany(mappedBy = "billEntity")
    private List<ProductEntity> productEntities;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private ClientEntity clientEntity;

}
