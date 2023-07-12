package bill.system.purchase.persistence.mapper;

import bill.system.purchase.domain.dto.ClientDto;
import bill.system.purchase.persistence.entity.ClientEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InterfaceClientMapper {
    /**
     * convierte una entidad cliente a dto
     * @param entidadCliente a convertir
     * @return dto
     */
    @Mapping(source ="id", target ="id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    ClientDto toClienteDto(ClientEntity entidadCliente);

    /**
     * convirte un dto a entidad
     * @param clienteDto a convertir
     * @return entidad
     */
    @InheritInverseConfiguration
    @Mapping(target = "billEntities", ignore = true)
    ClientEntity toEntidadCliente(ClientDto clienteDto);

    /**
     * devuelve una lista de clientes entidad convertida a clientes dto
     * @param clientEntitiesList lista de clientes entidad
     * @return lista de clientes dto
     */
    List<ClientDto> toListaClientesDto(List<ClientEntity> clientEntitiesList);

}
