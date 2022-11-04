package lab3.models.bidirectional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
public class Category {
    @Id
    private String id;
    private String name;

    @JsonBackReference
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
