package com.hibernate.auction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Alber Rashad
 * @created 12/09/2023
 * @description
 */
@Entity
@Table(name="bid")
@Data
@EqualsAndHashCode(callSuper = true)

public class Bid extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "item_id")
    @JsonIgnore
    private Item item;


    @Column(name = "value")
    private BigDecimal value;


}
