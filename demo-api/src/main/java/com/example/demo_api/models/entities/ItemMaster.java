package com.example.demo_api.models.entities;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="item_master")
public class ItemMaster implements Serializable {

   private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String itemcode;

    private String itemdesc;

    private double qty;

    private double price;

    public ItemMaster() {
    }

    public ItemMaster(long id, String itemcode, String itemdesc, double qty, double price) {
        this.id = id;
        this.itemcode = itemcode;
        this.itemdesc = itemdesc;
        this.qty = qty;
        this.price = price;
    }
}
