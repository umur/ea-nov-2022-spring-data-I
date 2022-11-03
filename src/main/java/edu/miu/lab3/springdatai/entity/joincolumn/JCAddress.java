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
@Entity(name = "jc_address")
public class JCAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String zip;
    private String city;

    @OneToOne(mappedBy = "address")
    private JCUser user;
}
