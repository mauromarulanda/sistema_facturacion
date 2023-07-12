package bill.system.purchase.persistence.mapper;

import bill.system.purchase.domain.dto.ProductDto;
import bill.system.purchase.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InterfaceProductMapper {
    /** convierte entidad en dto
     * @param entidadProducto
     * @return
     */
    @Mapping(source = "codeProduct", target = "codeProduct")
    @Mapping(source = "productDescription", target = "productDescription")
    @Mapping(source = "priceProduct", target = "priceProduct")
    ProductDto toProductoDto(ProductEntity entidadProducto);

    /** convierte dto en entidad
     * @param productoDto
     * @return
     */
    @InheritInverseConfiguration
    @Mapping(target = "billEntity", ignore = true)
    ProductEntity toEntidadProducto(ProductDto productoDto);

    /** lista de productos dto
     * @param ListaEntidadProductos
     * @return
     */
    List<ProductDto> toListaProductosDto(List<ProductEntity> ListaEntidadProductos);


}
