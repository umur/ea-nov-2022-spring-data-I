package lab3.models.userReviewJoinTable;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
public class User3JT {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany
    @JoinTable(name = "newtableUR")
    List<Review3JT> reviews;
}
