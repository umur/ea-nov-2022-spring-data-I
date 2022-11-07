package com.example.spring_data.entityUni;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "addressUni")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "addressUni")
public class AddressUni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private int zip;



}
