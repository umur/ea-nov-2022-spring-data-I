package com.waa.springdata.entity.embeddable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book  {
    @Id
    long id;
    @OneToMany (mappedBy = "book")
    @JsonIdentityInfo(generator = PropertyBasedObjectIdGenerator.class, property = "id")
    private Set<BookPublisher> bookPublishes;

    @Embedded
    private ChangeDates dates;

}
