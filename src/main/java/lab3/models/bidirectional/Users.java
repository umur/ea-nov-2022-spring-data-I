package lab3.models.bidirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
public class Users {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    List<Review> reviews;

    @OneToOne
    @JsonManagedReference
    Address address;
}
