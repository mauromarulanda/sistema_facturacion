package bill.system.purchase.domain.service;

import bill.system.purchase.domain.dto.BillDto;
import bill.system.purchase.domain.repository.InterfaceBillRepository;
import bill.system.purchase.domain.useCase.InterfaceBillUseCase;
import bill.system.purchase.persistence.entity.BillEntity;
import bill.system.purchase.persistence.mapper.InterfaceBillMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BillService implements InterfaceBillUseCase {

    private final InterfaceBillRepository interfaceBillRepository;

    private final InterfaceBillMapper interfaceBillMapper;

    /**
     *
     * @return
     */
    @Override
    public List<BillDto> getAll() {
        return interfaceBillRepository.getAll();
    }

    /**
     *
     * @param billNumber
     * @return
     */
    @Override
    public Optional<BillDto> getBillByNumberBill(Integer billNumber) {
        return interfaceBillRepository.getBillByNumberBill(billNumber);
    }

    /**
     *
     * @param idClient
     * @return
     */
    @Override
    public Optional<List<BillDto>> getBillsByClientId(Integer idClient) {

        Optional<List<BillEntity>> optionalBillEntities = interfaceBillRepository.getBillsByClientId(idClient);

        if (optionalBillEntities.isEmpty()) {
            return Optional.empty();
        }

        List<BillEntity> billEntities = optionalBillEntities.get();
        List<BillDto> billDtos = new ArrayList<>();

        for (BillEntity billEntity : billEntities) {
            BillDto billDto = interfaceBillMapper.toFacturaDto(billEntity);
            billDtos.add(billDto);
        }

        return Optional.of(billDtos);
    }

    /**
     *
     * @param newBill
     * @return
     */
    @Override
    public BillDto save(BillDto newBill) {
        return interfaceBillRepository.save(newBill);
    }

    /**
     *
     * @param billNumber
     * @return
     */
    @Override
    public boolean deleteBill(Integer billNumber) {
        if (interfaceBillRepository.getBillByNumberBill(billNumber).isEmpty()) {
            return false;
        }
        interfaceBillRepository.deleteBill(billNumber);
        return true;
    }
}
