package com.hibernate.auction.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */

@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="user_name")
    private String userName;


}
