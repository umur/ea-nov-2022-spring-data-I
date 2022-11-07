package miu.ea.assigment3.entity.DTOs;


import lombok.Data;



@Data
public class AddressDto {
    private int id;
    private String street;
    private String zip;
    private String city;
//    @OneToOne(mappedBy = "address")
//    private User user;
}
