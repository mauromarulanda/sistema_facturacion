package bill.system.purchase.persistence.repository;

import bill.system.purchase.domain.dto.ProductDto;
import bill.system.purchase.domain.repository.InterfaceProductRepository;
import bill.system.purchase.persistence.crud.InterfaceCrudProduct;
import bill.system.purchase.persistence.entity.ProductEntity;
import bill.system.purchase.persistence.mapper.InterfaceProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ProductRepository implements InterfaceProductRepository {

    private final InterfaceCrudProduct interfaceCrudProduct;

    private final InterfaceProductMapper interfaceProductMapper;

    /**
     *
     * @return
     */
    @Override
    public List<ProductDto> getAll() {
        return interfaceProductMapper.toListaProductosDto(interfaceCrudProduct.findAll());
    }

    /**
     *
     * @param codeProduct
     * @return
     */
    @Override
    public Optional<ProductDto> getProductByCodeProduct(Integer codeProduct) {
        String codeProductString = String.valueOf(codeProduct);
        return interfaceCrudProduct.findById(codeProductString).map(interfaceProductMapper::toProductoDto);
    }

    /**
     *
     * @param newProduct
     * @return
     */
    @Override
    public ProductDto save(ProductDto newProduct) {
        ProductEntity productEntity = interfaceProductMapper.toEntidadProducto(newProduct);
        return interfaceProductMapper.toProductoDto(interfaceCrudProduct.save(productEntity));
    }

    /**
     *
     * @param codeProduct
     */
    @Override
    public void deleteProduct(Integer codeProduct) {
        String codeProductString = String.valueOf(codeProduct);
        interfaceCrudProduct.deleteById(codeProductString);
    }
}
