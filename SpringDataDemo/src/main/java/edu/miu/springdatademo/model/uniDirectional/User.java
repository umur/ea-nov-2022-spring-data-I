package edu.miu.springdatademo.model.uniDirectional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @JsonIgnore
    @OneToOne
    @JoinColumn
    private Address address;
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Address> addresses;
}
