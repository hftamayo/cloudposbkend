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

    @Column(name = "id_product", nullable = false)
    private Integer id_product;

    @Column(name = "product_quantity", nullable = false)
    private Integer product_quantity;

    @Column(name = "product_price", nullable = false)
    private Float product_price;

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

    public Integer getIdProduct() {
        return id_product;
    }

    public void setIdProduct(Integer id_product) {
        this.id_product = id_product;
    }

    public Integer getProductQuantity() {
        return product_quantity;
    }

    public void setProductQuantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Float getProductPrice() {
        return product_price;
    }

    public void setProductPrice(Float product_price) {
        this.product_price = product_price;
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