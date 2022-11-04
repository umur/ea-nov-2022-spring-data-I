package edu.miu.lab3.springdatai.dto;

import lombok.Data;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Data
public class RequestProductDTO {
    private String name;

    private Double price;
    private Integer rating;
    private Long categoryId;
}
