package com.ejemplo.inventario.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_stock")
public class ProductStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    // Constructor vacío
    public ProductStock() {
    }

    // Constructor con parámetros
    public ProductStock(Long productId, Integer stock) {
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
