package lab3.models.bidirectional;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
public class Review {
    @Id
    private String id;
    private String comment;

    @ManyToOne
    @JsonManagedReference
    Product product;

    @ManyToOne
    @JsonManagedReference
    Users user;
}
