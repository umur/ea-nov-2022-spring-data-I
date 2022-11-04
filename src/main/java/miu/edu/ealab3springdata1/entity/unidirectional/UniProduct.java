package miu.edu.ealab3springdata1.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "uni_product")
public class UniProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String rating;

    @ManyToOne
//    @JoinColumn(name = "category_id")
    private UniCategory category;

    @OneToMany
            //(mappedBy = "product")
    private List<UniReview> reviews;
}
