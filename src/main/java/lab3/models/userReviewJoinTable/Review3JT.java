package lab3.models.userReviewJoinTable;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
public class Review3JT {
    @Id
    private String id;
    private String comment;

    @ManyToOne
    User3JT user;
}
