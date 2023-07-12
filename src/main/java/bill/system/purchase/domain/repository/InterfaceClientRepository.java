package bill.system.purchase.domain.repository;

import bill.system.purchase.domain.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface InterfaceClientRepository {
    /**
     *
     * @return
     */
    List<ClientDto> getAll();

    /**
     *
     * @param id
     * @return
     */
    Optional<ClientDto> getClientById(Integer id);

    /**
     *
     * @param newClient
     * @return
     */
    ClientDto save(ClientDto newClient);

    /**
     *
     * @param id
     */
    void detele(Integer id);
}
