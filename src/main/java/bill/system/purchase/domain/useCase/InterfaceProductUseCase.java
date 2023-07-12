package bill.system.purchase.domain.useCase;

import bill.system.purchase.domain.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface InterfaceProductUseCase {
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
     * @param productBody
     * @return
     */
    Optional<ProductDto> update(ProductDto productBody);

    /**
     *
     * @param codeProduct
     * @return
     */
    boolean deleteProduct(Integer codeProduct);
}
