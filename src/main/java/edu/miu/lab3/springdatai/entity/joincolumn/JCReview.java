package edu.miu.lab3.springdatai.entity.joincolumn;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Setter
@Getter
@Entity(name = "jc_review")
public class JCReview {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    @ManyToOne
    @JoinColumn(name = "u_id", referencedColumnName = "id")
    private JCUser user;
}
