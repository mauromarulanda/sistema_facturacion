package bill.system.purchase.persistence.crud;

import bill.system.purchase.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceCrudProduct extends JpaRepository<ProductEntity, String> {
}
