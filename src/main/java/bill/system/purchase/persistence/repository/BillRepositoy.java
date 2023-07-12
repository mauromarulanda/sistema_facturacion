package bill.system.purchase.persistence.repository;

import bill.system.purchase.domain.dto.BillDto;
import bill.system.purchase.domain.repository.InterfaceBillRepository;
import bill.system.purchase.persistence.crud.InterfaceCrudBill;
import bill.system.purchase.persistence.entity.BillEntity;
import bill.system.purchase.persistence.mapper.InterfaceBillMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class BillRepositoy implements InterfaceBillRepository {

    private final InterfaceCrudBill interfaceCrudBill;

    private final InterfaceBillMapper interfaceBillMapper;

    /**
     *
     * @return
     */
    @Override
    public List<BillDto> getAll() {
        return interfaceBillMapper.toListaFacturasDto(interfaceCrudBill.findAll());
    }

    /**
     *
     * @param billNumber
     * @return
     */
    @Override
    public Optional<BillDto> getBillByNumberBill(Integer billNumber) {
        return interfaceCrudBill.findById(billNumber).map(interfaceBillMapper::toFacturaDto);
    }

    /**
     *
     * @param idClient
     * @return
     */
    @Override
    public Optional<List<BillEntity>> getBillsByClientId(Integer idClient) {
        return interfaceCrudBill.findAllByClientId(idClient);
    }


    @Override
    public BillDto save(BillDto newbill) {
        BillEntity billEntity = interfaceBillMapper.toEntidadFactura(newbill);
        return interfaceBillMapper.toFacturaDto(interfaceCrudBill.save(billEntity));
    }

    /**
     *
     * @param billNumber
     */
    @Override
    public void deleteBill(Integer billNumber) {
        interfaceCrudBill.deleteById(billNumber);
    }
}
