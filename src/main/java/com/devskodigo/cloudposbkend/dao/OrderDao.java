package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.Order;
import java.util.List;


public interface OrderDao {
    public List<Order> getOrders();
    public Order getOrder(int id);;
    public void updateOrder(Order order);
    public void deleteOrder(int id);
}