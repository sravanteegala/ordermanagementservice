package com.shopkart.orderservice.service;

import com.shopkart.orderservice.model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();

}
