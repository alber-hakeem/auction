package com.hibernate.auction.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * @author Alber Rashad
 * @created 15/09/2023
 * @description
 */
@Data
public class BaseDto {
    @JsonIgnore
    private LocalDateTime createdDate;
    @JsonIgnore
    private LocalDateTime modifiedDate;
    @JsonIgnore
    private String createdBy;
    @JsonIgnore
    private String modifiedBy;
}
