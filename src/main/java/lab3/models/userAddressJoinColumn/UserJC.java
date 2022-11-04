package lab3.models.userAddressJoinColumn;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
public class UserJC {
    @Id
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;

    @OneToOne(mappedBy = "user")
    AddressJC address;
}
