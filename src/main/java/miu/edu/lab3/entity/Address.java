package miu.edu.lab3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {
    @Id
    private int id;
    private String street;
    private int zipCode;
    private String city;
}
