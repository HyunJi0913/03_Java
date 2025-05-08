package ch17.question.q2;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderId;
    private String customerName;
    private List<Product> products;
    private LocalDate orderDate;

    // 생성자
    public Order(int orderId, String customerName, List<Product> products, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.products = products;
        this.orderDate = orderDate;
    }

    // Getter 메서드들
    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    // 주문 총액 계산 메서드
    public double getTotalAmount() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
