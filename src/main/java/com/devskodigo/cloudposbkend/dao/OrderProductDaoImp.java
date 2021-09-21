package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.OrderProduct;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class OrderProductDaoImp implements OrderProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<OrderProduct> getOrderProduct() {
        String query ="FROM Products INNER JOIN Orders WHERE Orders.id = Products.id "; //por favor revisar esto
        return  entityManager.createQuery(query).getResultList();
    }

    @Override
    public OrderProduct getOrderProduct(int id) {
        String query = String.format("FROM Products P WHERE P.id = %d", id); //por favor revisar esto
        return (OrderProduct) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateOrderProduct(OrderProduct orderProduct) {

    }

    @Override
    public void deleteOrderProduct(int id) {

    }

}