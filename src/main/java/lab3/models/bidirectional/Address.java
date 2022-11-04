package lab3.models.bidirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Address {
    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    @JsonBackReference
    @OneToOne(mappedBy = "address")
    Users user;


}
