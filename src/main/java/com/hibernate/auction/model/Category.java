package com.hibernate.auction.model;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;

/**
 * @author Alber Rashad
 * @created 10/09/2023
 * @description
 */

@Entity
@Table(name="category")
@Data
public class Category extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
