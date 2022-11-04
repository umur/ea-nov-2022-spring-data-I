package miu.edu.ealab3springdata1.entity.joinTable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jt_address")
public class JTAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer street;
    private Integer zip;
    private String city;

    @OneToOne(mappedBy = "address",optional = false)
    private JTUser user;
}
