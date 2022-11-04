package miu.edu.ealab3springdata1.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bi_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer street;
    private Integer zip;
    private String city;

    @OneToOne(mappedBy = "address",optional = false)
    private User user;
}
