package edu.miu.springdatademo.model.uniDirectional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private int price;
    private int rating;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Category category;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<Review> reviewList;
}
