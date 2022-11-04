package miu.edu.ealab3springdata1.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "jc_product")
public class JCProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String rating;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private JCCategory category;

    @OneToMany(mappedBy = "product")
    private List<JCReview> reviews;
}
