package com.waa.springdata.entity.embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    long id;
    @OneToMany(mappedBy = "publisher")
    private Set<BookPublisher> bookPublishes;
}
