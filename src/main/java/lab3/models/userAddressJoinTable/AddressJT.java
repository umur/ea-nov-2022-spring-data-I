package lab3.models.userAddressJoinTable;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class AddressJT {
    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    @JoinTable(name = "userAddress")
    @OneToOne
    UserJT user;
}
