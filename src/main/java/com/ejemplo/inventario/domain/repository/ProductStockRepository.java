package main.java.com.ejemplo.inventario.domain.repository;

import com.ejemplo.inventario.domain.entities.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {
    // No es necesario agregar métodos adicionales, JpaRepository ya proporciona las operaciones básicas
    Optional<ProductStock> findByProductId(Long productId);
}
