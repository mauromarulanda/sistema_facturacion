package bill.system.purchase.persistence.crud;

import bill.system.purchase.persistence.entity.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InterfaceCrudBill extends JpaRepository<BillEntity, Integer> {
    /**
     *
     * @param idClient
     * @return
     */
    Optional<List<BillEntity>> findAllByClientId(Integer idClient);
}
