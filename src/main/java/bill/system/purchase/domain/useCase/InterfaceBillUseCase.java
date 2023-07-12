package bill.system.purchase.domain.useCase;

import bill.system.purchase.domain.dto.BillDto;

import java.util.List;
import java.util.Optional;

public interface InterfaceBillUseCase {
    /**
     * @return
     */
    List<BillDto> getAll();

    /**
     * @param billNumber
     * @return
     */
    Optional<BillDto> getBillByNumberBill(Integer billNumber);

    /**
     * @param idClient
     * @return
     */
    Optional<List<BillDto>> getBillsByClientId(Integer idClient);

    /**
     *
     * @param newBill
     * @return
     */
    BillDto save(BillDto newBill);

    /**
     * @param billNumber
     * @return
     */
    boolean deleteBill(Integer billNumber);
}
