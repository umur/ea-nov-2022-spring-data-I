package miu.edu.jpa.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;
}
