package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.OrderProduct;

import java.util.List;

public interface OrderProductDao {
    public List<OrderProduct> getOrderProduct();
    public OrderProduct getOrderProduct(int id);;
    public void updateOrderProduct(OrderProduct order);
    public void deleteOrderProduct(int id);
}