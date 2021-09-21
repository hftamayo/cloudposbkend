package com.devskodigo.cloudposbkend.controllers;

import com.devskodigo.cloudposbkend.dao.OrderProductDao;
import com.devskodigo.cloudposbkend.models.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderProductController {
    @Autowired
    OrderProductDao orderProductDao;

    @RequestMapping(value = "api/orderproduct/{id}",method = RequestMethod.GET)
    public OrderProduct getOrderProduct(@PathVariable int id){
        return orderProductDao.getOrderProduct(id);
    }

    @RequestMapping(value = "api/orderproducts",method = RequestMethod.GET)
    public List<OrderProduct> getOrderProducts(){
        return orderProductDao.getOrderProduct();
    }

    @RequestMapping(value = "api/orderproducts",method = RequestMethod.POST)
    public void createOrderProduct(){

    }

    @RequestMapping(value = "api/orderproducts/{id}",method = RequestMethod.DELETE)
    public void deleteOrderProduct(){

    }

    @RequestMapping(value = "api/orderproducts",method = RequestMethod.PUT)
    public void updateOrderProduct(){

    }
}