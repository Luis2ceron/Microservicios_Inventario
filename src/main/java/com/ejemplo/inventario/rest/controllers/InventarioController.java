 package com.ejemplo.inventario.rest.controllers;

import com.ejemplo.inventario.domain.entities.ProductStockDTO;
import com.ejemplo.inventario.services.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventarioController {

    @Autowired
    private ProductStockService productStockService;

    @GetMapping
    public List<ProductStockDTO> getAllProductStocks() {
        return productStockService.getAllProductStocks()
            .stream()
            .map(ps -> new ProductStockDTO(ps.getProductId(), ps.getStock()))
            .toList();
    }

    @PutMapping("/{productId}")
    public String updateProductStock(@PathVariable Long productId, @RequestBody ProductStockDTO productStockDTO) {
        ProductStock updatedProduct = productStockService.updateProductStock(productId, productStockDTO.getStock());
        if (updatedProduct != null) {
            return "Stock actualizado";
        } else {
            return "Producto no encontrado";
        }
    }

    @PostMapping("/reorder")
    public String reorderProduct(@RequestBody ProductStockDTO productStockDTO) {
        return productStockService.reorderProduct(productStockDTO.getProductId(), productStockDTO.getStock());
    }
}

