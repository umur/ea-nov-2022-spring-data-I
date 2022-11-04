package miu.edu.ealab3springdata1.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "uni_address")
public class UniAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer street;
    private Integer zip;
    private String city;

    @OneToOne
    private UniUser user;
}
