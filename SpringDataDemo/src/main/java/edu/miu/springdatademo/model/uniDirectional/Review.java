package edu.miu.springdatademo.model.uniDirectional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {
    @Id
    private int id;
    private String comment;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private User user;
    @ManyToOne
    @JsonIgnore
    @JoinColumn
    private Product product;
}
