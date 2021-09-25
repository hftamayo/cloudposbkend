package com.devskodigo.cloudposbkend.controllers;

import com.devskodigo.cloudposbkend.dao.OrderDao;
import com.devskodigo.cloudposbkend.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @RequestMapping(value = "api/orders/{id}",method = RequestMethod.GET)
    public Order getOrder(@PathVariable int id){
        return orderDao.getOrder(id);
    }

    @RequestMapping(value = "api/orders",method = RequestMethod.GET)
    public List<Order> getOrders(){
        return orderDao.getOrders();
    }

    @RequestMapping(value = "api/orders",method = RequestMethod.POST)
    public void createOrder(){

    }

    @RequestMapping(value = "api/orders/{id}",method = RequestMethod.DELETE)
    public void deleteOrder(){

    }

    @RequestMapping(value = "api/orders",method = RequestMethod.PUT)
    public void updateOrder(){

    }
}