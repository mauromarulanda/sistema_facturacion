package bill.system.purchase.domain.repository;

import bill.system.purchase.domain.dto.BillDto;
import bill.system.purchase.persistence.entity.BillEntity;

import java.util.List;
import java.util.Optional;

public interface InterfaceBillRepository {
    /**
     *
     * @return
     */
    List<BillDto> getAll();

    /**
     *
     * @param billNumber
     * @return
     */
    Optional<BillDto> getBillByNumberBill(Integer billNumber);

    /**
     * @param idClient
     * @return
     */
    Optional<List<BillEntity>> getBillsByClientId(Integer idClient);

    /**
     *
     * @param newbill
     * @return
     */
    BillDto save(BillDto newbill);
    /**
     *
     * @param billNumber
     * @return
     */
    void deleteBill(Integer billNumber);
}
