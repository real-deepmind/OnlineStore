package model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Order extends BaseEntity<Long> {
    private String customerName;
    private LocalDate orderDate;
    private Double totalAmount;
    public Order() {}

    public Order(String customerName, LocalDate orderDate, Double totalAmount) {
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
