package edu.miu.springdatademo.model.uniDirectional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private int zip;
    private String city;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private User user;

}
