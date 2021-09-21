package com.devskodigo.cloudposbkend.controllers;

import com.devskodigo.cloudposbkend.dao.ProductDao;
import com.devskodigo.cloudposbkend.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductDao productDao;

    @RequestMapping(value = "api/product/{id}",method = RequestMethod.GET)
    public Product getProduct(@PathVariable int id){
        return productDao.getProduct(id);
    }

    @RequestMapping(value = "api/products",method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productDao.getProducts();
    }

    @RequestMapping(value = "api/products",method = RequestMethod.POST)
    public void createProduct(){

    }

    @RequestMapping(value = "api/products/{id}",method = RequestMethod.DELETE)
    public void deleteProduct(){

    }

    @RequestMapping(value = "api/products",method = RequestMethod.PUT)
    public void updateProduct(){

    }
}