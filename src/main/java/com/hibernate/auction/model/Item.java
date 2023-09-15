package com.hibernate.auction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Alber Rashad
 * @created 10/09/2023
 * @description
 */
@Entity
@Table(name = "item")
@EqualsAndHashCode
public class Item extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @Getter
    @Setter
    private Category category;


    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Set<Bid> bids = new HashSet<>();

    protected void setBids(Set<Bid> bids) {
        this.bids = bids;
    }

    public Set<Bid> getBids() {
        return Collections.unmodifiableSet(bids);
    }

    public void addBid(Bid bid){
        if(bid == null)
            throw new NullPointerException("Bid shouldn't be null");
        if(bid.getItem()!=null)
            throw new IllegalStateException("Bid is already assigned to an item");
        bids.add(bid);
        bid.setItem(this);
    }


}
