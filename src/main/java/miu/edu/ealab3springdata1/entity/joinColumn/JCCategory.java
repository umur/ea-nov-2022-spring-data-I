package miu.edu.ealab3springdata1.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "jc_category")
public class JCCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    //@JoinColumn(name = "product_id")
    private List<JCProduct> products;
}
