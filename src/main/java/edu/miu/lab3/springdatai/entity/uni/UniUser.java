package edu.miu.lab3.springdatai.entity.uni;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Author: Kuylim TITH
 * Date: 11/3/2022
 */
@Setter
@Getter
@Entity(name = "uni_user")
public class UniUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private String firstname;
    private String lastname;

    @OneToOne
    private UniAddress address;
}
