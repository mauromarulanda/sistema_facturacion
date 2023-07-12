package bill.system.purchase.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class ProductEntity {
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", nullable = false)
    private Integer codeProduct;
    /**
     *
     */
    @Column(name = "descripcion")
    private String productDescription;
    /**
     *
     */
    @Column(name = "price")
    private Double priceProduct;
    /**
     *
     */
    @ManyToOne
    @JoinColumn(name = "billNumber", insertable = false, updatable = false)
    private BillEntity billEntity;
}
