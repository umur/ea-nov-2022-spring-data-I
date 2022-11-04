package com.waa.springdata.entity.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BookPublisherKey  implements Serializable {
    private  long bookId;
    private  long publisherId;
}
