package bill.system.purchase.domain.service;

import bill.system.purchase.domain.dto.ProductDto;
import bill.system.purchase.domain.repository.InterfaceProductRepository;
import bill.system.purchase.domain.useCase.InterfaceProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService implements InterfaceProductUseCase {

    private final InterfaceProductRepository interfaceProductRepository;

    @Override
    public List<ProductDto> getAll() {
        return interfaceProductRepository.getAll();
    }

    @Override
    public Optional<ProductDto> getProductByCodeProduct(Integer codeProduct) {
        return interfaceProductRepository.getProductByCodeProduct(codeProduct);
    }

    @Override
    public ProductDto save(ProductDto newProduct) {
        return interfaceProductRepository.save(newProduct);
    }

    @Override
    public Optional<ProductDto> update(ProductDto productBody) {
        if (interfaceProductRepository.getProductByCodeProduct(productBody.getCodeProduct()).isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(interfaceProductRepository.save(productBody));
}

    @Override
    public boolean deleteProduct(Integer codeProduct) {
        if (interfaceProductRepository.getProductByCodeProduct(codeProduct).isEmpty()){
            return false;
        }
        interfaceProductRepository.deleteProduct(codeProduct);
        return true;
    }
}
