package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImp implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getProducts() {
        String query ="FROM Products";
        return  entityManager.createQuery(query).getResultList();
    }

    @Override
    public Product getProduct(int id) {
        String query = String.format("FROM Products P WHERE P.id = %d", id);
        return (Product) entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int id) {

    }

}