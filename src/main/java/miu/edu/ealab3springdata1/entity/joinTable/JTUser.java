package miu.edu.ealab3springdata1.entity.joinTable;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "jt_users")
public class JTUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
//    @JoinColumn(name = "address_id")
    @JoinTable(
            name = "jt_user",
            joinColumns = @JoinColumn(name = "fk_address_id"),
            inverseJoinColumns = @JoinColumn(name = "pk_user_id")
    )
    private JTAddress address;

    @OneToMany(mappedBy = "user")
    private List<JTReview> JTReviews;
}
