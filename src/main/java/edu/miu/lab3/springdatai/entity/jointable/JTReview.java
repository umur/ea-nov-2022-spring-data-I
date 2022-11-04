package edu.miu.lab3.springdatai.entity.jointable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Setter
@Getter
@Entity(name = "jt_review")
public class JTReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    @ManyToOne
    @JoinTable(name = "jt_user_review_prod",
            joinColumns = @JoinColumn(name = "rev_id",
                    referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "u_id", referencedColumnName = "id"))
    private JTUser user;
}
