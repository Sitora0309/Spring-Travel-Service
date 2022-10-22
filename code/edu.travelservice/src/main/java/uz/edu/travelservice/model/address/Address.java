package uz.edu.travelservice.model.address;

import lombok.*;
import uz.edu.travelservice.model.CommunityMember;
import uz.edu.travelservice.model.generator.IdGenerator;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address extends IdGenerator {

    @Column(name="address_type")
    private AdressType adressType;
    @Column(name = "country")
    private String country;
    @Column(name = "street_address")
    private String streetAddress;
    @Column(name = "zip_address")
    private String zipAdress;
    @Column(name = "zip_code")
    private String zipCode;


    @ManyToOne
    @JoinColumn(name = "member_id")
    private CommunityMember member;

}
