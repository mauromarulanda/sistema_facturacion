package bill.system.purchase.persistence.mapper;

import bill.system.purchase.domain.dto.BillDto;
import bill.system.purchase.persistence.entity.BillEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InterfaceBillMapper {
    /**
     * @param entidadFactura
     * @return
     */
    @Mapping(source = "billNumber", target = "billNumber")
    @Mapping(source = "date", target = "date")
    @Mapping(source = "total", target = "total")
    @Mapping(source = "taxes", target = "taxes")
    BillDto toFacturaDto(BillEntity entidadFactura);

    /**
     * @param facturaDto
     * @return
     */
    @InheritInverseConfiguration
    @Mapping(target = "productEntities", ignore = true)
    @Mapping(target = "clientEntity", ignore = true)
    BillEntity toEntidadFactura(BillDto facturaDto);

    /**
     * @param listaEntidadFacturas
     * @return
     */
    List<BillDto> toListaFacturasDto(List<BillEntity> listaEntidadFacturas);
}
