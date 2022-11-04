package miu.edu.ealab3springdata1.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "uni_category")
public class UniCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

//    @OneToMany(mappedBy = "category")
////    @JoinColumn(name = "product_id")
//    private List<Product> products;
}
