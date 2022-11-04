package miu.edu.ealab3springdata1.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "bi_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
//    @JoinColumn(name = "product_id")
    private List<Product> products;
}
