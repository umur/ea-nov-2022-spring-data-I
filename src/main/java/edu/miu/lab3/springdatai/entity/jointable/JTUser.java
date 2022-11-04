package edu.miu.lab3.springdatai.entity.jointable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Setter
@Getter
@Entity(name = "jt_user")
public class JTUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<JTReview> review;
}
