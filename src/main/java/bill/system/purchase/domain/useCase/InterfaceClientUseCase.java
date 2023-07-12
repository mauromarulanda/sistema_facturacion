package bill.system.purchase.domain.useCase;

import bill.system.purchase.domain.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface InterfaceClientUseCase {
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
     * @param clientBody
     * @return
     */
    Optional<ClientDto> update(ClientDto clientBody);

    /**
     *
     * @param id
     * @return
     */
    boolean detele(Integer id);
}
