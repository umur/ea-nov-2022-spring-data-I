package com.waa.springdata.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    private int id;
    private String name;
    // the next relation can create circular r/n - stack overflow
    @OneToMany(mappedBy = "category") // or @JoinColumn
    //@JsonManagedReference // serialize this property i.e this is forward relation
    //@JsonBackReference //  don't serialize products.
    // to show/serialize products without recursive calls
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    private List<Product> products;

}
