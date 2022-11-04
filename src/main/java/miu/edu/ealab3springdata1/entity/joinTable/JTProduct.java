package miu.edu.ealab3springdata1.entity.joinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "jt_product")
public class JTProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String rating;

    @ManyToOne
//    @JoinColumn(name = "category_id")
    @JoinTable(
            name = "jt_product_review",
            joinColumns = @JoinColumn(name = "fk_product_id"),
            inverseJoinColumns = @JoinColumn(name = "pk_review_id")
    )
    private JTCategory category;

    @OneToMany(mappedBy = "product")
    private List<JTReview> reviews;
}
