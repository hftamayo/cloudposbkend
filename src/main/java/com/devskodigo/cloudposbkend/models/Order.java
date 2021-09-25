package com.devskodigo.cloudposbkend.models;

import javax.persistence.*;

@Table(name = "`orders`")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order", nullable = false)
    private Integer id;

    @Column(name = "orders_date", length = 45)
    private String ordersDate;

    @Column(name = "orders_status", length = 45)
    private String ordersStatus;

    @Column(name = "orders_delivaddress", length = 80)
    private String ordersDeliveryAddress;

    @Column(name = "id_payment", nullable = false)
    private Integer id_payment;

    @Column(name = "id_user", nullable = false)
    private Integer id_user;

    public String getOrdersStatus() {
        return ordersStatus;
    }

    public void setOrdersStatus(String ordersStatus) {
        this.ordersStatus = ordersStatus;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(String ordersDate) {
        this.ordersDate = ordersDate;
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