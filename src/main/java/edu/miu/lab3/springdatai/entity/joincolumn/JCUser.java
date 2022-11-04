package edu.miu.lab3.springdatai.entity.joincolumn;

import edu.miu.lab3.springdatai.entity.jointable.JTAddress;
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
@Entity(name = "jc_user")
public class JCUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "user")
    private List<JCReview> reviews;

    @OneToOne
    @JoinColumn(name = "addr_id")
    private JCAddress address;
}
