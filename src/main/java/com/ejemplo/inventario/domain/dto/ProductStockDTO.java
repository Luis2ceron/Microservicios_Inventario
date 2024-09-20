package com.ejemplo.inventario.domain.dto;

public class ProductStockDTO {
    private Long productId;
    private Integer stock;

    // Constructor vacío
    public ProductStockDTO() {
    }

    // Constructor con parámetros
    public ProductStockDTO(Long productId, Integer stock) {
        this.productId = productId;
        this.stock = stock;
    }

    // Getters y Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
