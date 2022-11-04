package miu.edu.ealab3springdata1.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "uni_users")
public class UniUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Address address;

    @OneToMany
    private List<UniReview> reviews;
}
