package miu.edu.ealab3springdata1.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jc_address")
public class JCAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer street;
    private Integer zip;
    private String city;

    @OneToOne(mappedBy = "address",optional = false)
    private JCUser user;
}
