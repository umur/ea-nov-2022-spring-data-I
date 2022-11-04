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
@Entity(name = "jt_address")
public class JTAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String zip;
    private String city;

    @OneToOne
    @JoinTable(name = "jt_user_address")
    private JTUser user;
}
