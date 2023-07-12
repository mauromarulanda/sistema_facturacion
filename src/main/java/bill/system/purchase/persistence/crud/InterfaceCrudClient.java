package bill.system.purchase.persistence.crud;

import bill.system.purchase.persistence.entity.BillEntity;
import bill.system.purchase.persistence.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterfaceCrudClient extends JpaRepository<ClientEntity, Integer> {

}
