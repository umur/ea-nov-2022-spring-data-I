package miu.edu.ealab3springdata1.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bi_review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;

    @ManyToOne
    //@JoinColumn(name = "user_id")
//    @JoinTable(
//            name = "user_review",
//            joinColumns = @JoinColumn(name = "fk_user_id"),
//            inverseJoinColumns = @JoinColumn(name = "pk_review_id")
//    )
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
