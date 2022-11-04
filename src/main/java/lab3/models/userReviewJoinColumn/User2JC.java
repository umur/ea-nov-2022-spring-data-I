package lab3.models.userReviewJoinColumn;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
public class User2JC {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user")
    List<Review2JC> reviews;
}
