package edu.miu.lab3.springdatai.dto;

import lombok.Data;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Data
public class RequestReviewDTO {

    private String comment;
    private Long userId;
    private Long productId;
}
