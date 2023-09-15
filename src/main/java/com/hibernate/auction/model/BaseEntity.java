package com.hibernate.auction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name="modified_date")
    @JsonIgnore
    private LocalDateTime modifiedDate;

    @CreatedBy
    @Column(name="created_by")
    @JsonIgnore
    private String createdBy;

    @LastModifiedBy
    @Column(name="modified_by",updatable = false)
    @JsonIgnore
    private String modifiedBy;

}
