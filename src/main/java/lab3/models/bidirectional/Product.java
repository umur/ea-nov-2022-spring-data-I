package lab3.models.bidirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
public class Product {
    @Id
    private String id;
    private String name;
    private String rating;
    private double price;

    @ManyToOne
    @JsonManagedReference
    Category category;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    List<Review> reviews;
}
