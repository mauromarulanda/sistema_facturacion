package bill.system.purchase.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class ClientEntity {
    /**
     *
     */
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    /**
     *
     */
    @Column(name = "nombres")
    private String name;
    /**
     *
     */
    @Column(name = "apellidos")
    private String lastName;
    /**
     *
     */
    @Column(name = "telefono")
    private String phoneNumber;

    /**
     *
     */
    @OneToMany(mappedBy = "clientEntity")
    List<BillEntity> billEntities;
}
