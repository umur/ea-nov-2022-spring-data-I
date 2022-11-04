package miu.edu.ealab3springdata1.entity.joinTable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jt_review")
public class JTReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    //@JoinColumn(name = "user_id")
    @JoinTable(
            name = "jt_user_review",
            joinColumns = @JoinColumn(name = "fk_user_id"),
            inverseJoinColumns = @JoinColumn(name = "pk_review_id")
    )
    private JTUser user;

    @ManyToOne
    //@JoinColumn(name = "product_id")
    @JoinTable(
            name = "jt_product",
            joinColumns = @JoinColumn(name = "fk_product_id"),
            inverseJoinColumns = @JoinColumn(name = "pk_review_id")
    )
    private JTProduct product;
}
