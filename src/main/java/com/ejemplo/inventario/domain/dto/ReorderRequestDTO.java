package com.ejemplo.inventario.domain.dto;

public class ReorderRequestDTO {
    private Long productId;
    private Integer quantity;

    // Constructor vacío
    public ReorderRequestDTO() {
    }

    // Constructor con parámetros
    public ReorderRequestDTO(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters y Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
