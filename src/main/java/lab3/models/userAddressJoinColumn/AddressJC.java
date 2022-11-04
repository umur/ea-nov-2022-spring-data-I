package lab3.models.userAddressJoinColumn;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
public class AddressJC {
    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    UserJC user;
}
