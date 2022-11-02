package miu.edu.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import miu.edu.jpa.model.Category;

@Data
@RequiredArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Double rating;
}
