package lab3.models.unidirectional;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class UniUser {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany
    @JoinColumn(name = "user_id")
    List<UniReview> reviews;

    @OneToOne
    UniAddress address;
}
