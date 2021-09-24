package com.devskodigo.cloudposbkend.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "order_product")
@Entity
public class OrderProduct{
    @EmbeddedId
    private OrderProduct id;

    public OrderProduct getId() {
        return id;
    }

    public void setId(OrderProduct id) {
        this.id = id;
    }
}