package bill.system.purchase.persistence.repository;

import bill.system.purchase.domain.dto.ClientDto;
import bill.system.purchase.domain.repository.InterfaceClientRepository;
import bill.system.purchase.persistence.crud.InterfaceCrudClient;
import bill.system.purchase.persistence.entity.ClientEntity;
import bill.system.purchase.persistence.mapper.InterfaceClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ClientRepository implements InterfaceClientRepository {

    private final InterfaceCrudClient interfaceCrudClient;

    private final InterfaceClientMapper interfaceClientMapper;

    /**
     *
     * @return
     */
    @Override
    public List<ClientDto> getAll() {

        return interfaceClientMapper.toListaClientesDto(interfaceCrudClient.findAll());
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<ClientDto> getClientById(Integer id) {
        return interfaceCrudClient.findById(id).map(interfaceClientMapper::toClienteDto);
    }

    /**
     *
     * @param newClient
     * @return
     */
    @Override
    public ClientDto save(ClientDto newClient) {
        ClientEntity clientEntity = interfaceClientMapper.toEntidadCliente(newClient);
        return interfaceClientMapper.toClienteDto(interfaceCrudClient.save(clientEntity));
    }

    /**
     *
     * @param id
     */
    @Override
    public void detele(Integer id) {
        interfaceCrudClient.deleteById(id);
    }
}
