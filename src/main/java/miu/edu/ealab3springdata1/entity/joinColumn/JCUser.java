package miu.edu.ealab3springdata1.entity.joinColumn;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "jc_users")
public class JCUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "address_id")
    private JCAddress address;

    @OneToMany(mappedBy = "user")
    private List<JCReview> reviews;
}
