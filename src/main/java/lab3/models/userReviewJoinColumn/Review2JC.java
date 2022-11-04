package lab3.models.userReviewJoinColumn;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
public class Review2JC {
    @Id
    private String id;
    private String comment;

    @ManyToOne
    User2JC user;
}
