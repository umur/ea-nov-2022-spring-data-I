package miu.edu.ealab3springdata1.entity.joinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "jt_category")
public class JTCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
//    @JoinColumn(name = "product_id")
//    @JoinTable(
//            name = "jt_category_product",
//            joinColumns = @JoinColumn(name = "fk_user_id"),
//            inverseJoinColumns = @JoinColumn(name = "pk_review_id")
//    )
    private List<JTProduct> products;
}
