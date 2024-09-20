import jakarta.persistence.*;

@Entity
@Table(name = "reorder_request")
public class ReorderRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long requestId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    // Constructor vacío
    public ReorderRequest() {
    }

    // Constructor con parámetros
    public ReorderRequest(Long productId, Integer quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    // Getters y Setters
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

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
