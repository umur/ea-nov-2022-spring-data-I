package com.waa.springdata.entity.embeddable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class BookPublisher {
    @EmbeddedId // adds, to DDL, primary key (book_id, publisher_id)
    BookPublisherKey  bookPublisherKey;

    @ManyToOne
    @MapsId("bookId") // create column and add constraint that references book table
    private Book book; // referenced table, foreign key ->book
    @ManyToOne
    @MapsId("publisherId") // create column and add constraint that references publisher table
    private Publisher publisher; // foreign key
    // other columns
    private double publishingPrice;
}
