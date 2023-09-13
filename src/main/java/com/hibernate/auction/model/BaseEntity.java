package com.hibernate.auction.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * @author Alber Rashad
 * @created 10/09/2023
 * @description
 */
@MappedSuperclass
@Data
public class BaseEntity {

    @CreationTimestamp
    @Column(name="created_date",updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name="modified_date")
    private LocalDateTime modifiedDate;

    @CreatedBy
    @Column(name="created_by")
    private String createdBy;

    @LastModifiedBy
    @Column(name="modified_by",updatable = false)
    private String modifiedBy;

}
