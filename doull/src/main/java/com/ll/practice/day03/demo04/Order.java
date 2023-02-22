package com.ll.practice.day03.demo04;

import java.util.Objects;

/**
 * @Author lin_li
 * @Date 2022/6/17 23:51
 */
public class Order {
    int orderId;
    String OrderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        OrderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        OrderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(OrderName, order.OrderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, OrderName);
    }
}
