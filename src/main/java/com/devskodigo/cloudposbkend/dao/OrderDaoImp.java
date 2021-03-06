package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class OrderDaoImp implements OrderDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Order> getOrders() {
        String query ="FROM Order";
        return  entityManager.createQuery(query).getResultList();
    }

    @Override
    public Order getOrder(int id) {
        String query = String.format("FROM Order O WHERE O.id = %d", id);
        return (Order) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateOrder(Order order) {

    }

    @Override
    public void deleteOrder(int id) {

    }

}