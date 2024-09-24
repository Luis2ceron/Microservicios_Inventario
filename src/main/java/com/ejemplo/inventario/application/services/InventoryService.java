 import com.ejemplo.inventario.domain.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    private ProductStockRepository productStockRepo;

    public List<ProductStock> getAll() {
        return productStockRepo.getAll();
    }

    public Optional<ProductStock> getById(long productId) {
        return productStockRepo.getById(productId);
    }

    public ProductStock updateStock(long productId, ProductStock updatedStock) {
        if (getById(productId).isPresent()) {
            return productStockRepo.updateStock(productId, updatedStock);
        }
        throw new RuntimeException("Product not found");
    }

    public String reorder(ReorderRequest reorderRequest) {
        // Lógica para procesar la reposición
        productStockRepo.reorder(reorderRequest.getProductId(), reorderRequest.getQuantity());
        return "Reposición solicitada";
    }
}
