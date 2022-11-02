package miu.edu.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ReviewDTO {
    private Long id;
    private String comment;
}
