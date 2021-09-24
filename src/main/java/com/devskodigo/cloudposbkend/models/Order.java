package com.devskodigo.cloudposbkend.models;

import javax.persistence.*;

@Table(name = "order")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer id;

    @Column(name = "orderDate", length = 45)
    private String orderDate;

    @Column(name = "orderStatus", length = 45)
    private String orderStatus;

    @Column(name = "ordersDeliveryAddress", length = 80)
    private String ordersDeliveryAddress;

    @Column(name = "id_payment", nullable = false)
    private Integer id_payment;

    @Column(name = "id_user", nullable = false)
    private Integer id_user;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersDeliveryAddress() {
        return ordersDeliveryAddress;
    }

    public void setOrdersDeliveryAddress(String ordersDeliveryAddress) {
        this.ordersDeliveryAddress = ordersDeliveryAddress;
    }

    public Integer getIdPayment() {
        return id_payment;
    }

    public void setIdPayment(Integer id_payment) {
        this.id_payment = id_payment;
    }

    public Integer getIdUser() {
        return id_user;
    }

    public void setIdUser(Integer id_user) {
        this.id_user = id_user;
    }
}