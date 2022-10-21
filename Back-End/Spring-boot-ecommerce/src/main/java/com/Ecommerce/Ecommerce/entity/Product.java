package com.Ecommerce.Ecommerce.entity;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private ProductCategory category;
    @Column(name="sku")
    private String sku;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="unitprice")
    private BigDecimal unitprice;
    @Column(name="imageurl")
    private String imageurl;
    @Column(name="active")
    private boolean active;
    @Column(name="unitsInStock")
    private int unitsInStock;
    @Column(name="dateCreated")
    @CreationTimestamp
    private Data dateCreated;
    @Column(name="lastUpdated")
    @UpdateTimestamp
    private Data lastUpdated;

}
