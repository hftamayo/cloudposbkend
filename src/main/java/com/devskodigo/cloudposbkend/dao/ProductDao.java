package com.devskodigo.cloudposbkend.dao;

import com.devskodigo.cloudposbkend.models.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getProducts();
    public Product getProduct(int id);;
    public void updateProduct(Product product);
    public void deleteProduct(int id);
}