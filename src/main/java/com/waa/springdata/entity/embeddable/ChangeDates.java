package com.waa.springdata.entity.embeddable;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class ChangeDates {
    LocalDateTime dateAdded;
    LocalDateTime dateUpdated;
}
