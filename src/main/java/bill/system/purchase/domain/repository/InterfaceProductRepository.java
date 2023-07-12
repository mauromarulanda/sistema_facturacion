package bill.system.purchase.domain.repository;

import bill.system.purchase.domain.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface InterfaceProductRepository {
    /**
     *
     * @return
     */
    List<ProductDto> getAll();

    /**
     *
     * @param codeProduct
     * @return
     */
    Optional<ProductDto> getProductByCodeProduct(Integer codeProduct);

    /**
     *
     * @param newProduct
     * @return
     */
    ProductDto save(ProductDto newProduct);

    /**
     *
     * @param codeProduct
     */
    void deleteProduct(Integer codeProduct);
}
