package main.java.com.ejemplo.inventario.domain.service;

import com.ejemplo.inventario.domain.entities.ProductStock;
import com.ejemplo.inventario.domain.entities.ReorderRequest;
import com.ejemplo.inventario.domain.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private ProductStockRepository productStockRepo;

    public List<ProductStock> getAll() {
        return productStockRepo.findAll();
    }

    public ProductStock getById(Long productId) {
        return productStockRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public ProductStock updateStock(Long productId, ProductStock updatedStock) {
        ProductStock existingStock = getById(productId);
        existingStock.setStock(updatedStock.getStock());
        return productStockRepo.save(existingStock);
    }

    public String reorder(ReorderRequest reorderRequest) {
        ProductStock existingStock = getById(reorderRequest.getProductId());
        existingStock.setStock(existingStock.getStock() + reorderRequest.getQuantity());
        productStockRepo.save(existingStock);
        return "Reposición solicitada";
    }
}
