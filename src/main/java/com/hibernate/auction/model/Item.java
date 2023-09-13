package com.hibernate.auction.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Alber Rashad
 * @created 10/09/2023
 * @description
 */
@Entity
@Table(name="item")
@Data
public class Item extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name" )
    private String name;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id",referencedColumnName = "id",nullable = false)
    private Category category;



    @OneToMany(mappedBy = "item",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    private Set<Bid> bids=new HashSet<>();
}
