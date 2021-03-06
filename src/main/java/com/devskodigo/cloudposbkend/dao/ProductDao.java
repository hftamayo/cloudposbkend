package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts();
    Product getProduct(int id);;
    void updateProduct(Product product);
    void deleteProduct(int id);
    void createProduct(Product product);
}