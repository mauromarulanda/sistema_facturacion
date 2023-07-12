package bill.system.purchase.domain.service;

import bill.system.purchase.domain.dto.ClientDto;
import bill.system.purchase.domain.repository.InterfaceClientRepository;
import bill.system.purchase.domain.useCase.InterfaceClientUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClientService implements InterfaceClientUseCase {

    private final InterfaceClientRepository interfaceClientRepository;

    @Override
    public List<ClientDto> getAll() {
        return interfaceClientRepository.getAll();
    }

    @Override
    public Optional<ClientDto> getClientById(Integer id) {
        return interfaceClientRepository.getClientById(id);
    }

    @Override
    public ClientDto save(ClientDto newClient) {
        return interfaceClientRepository.save(newClient);
    }

    @Override
    public Optional<ClientDto> update(ClientDto clientBody) {
        if (interfaceClientRepository.getClientById(clientBody.getId()).isEmpty()){
            return Optional.empty();
        }
        return  Optional.of(interfaceClientRepository.save(clientBody));
    }

    @Override
    public boolean detele(Integer id) {
        if (interfaceClientRepository.getClientById(id).isEmpty()){
            return false;
        }
        interfaceClientRepository.getClientById(id);
        return true;
    }
}
