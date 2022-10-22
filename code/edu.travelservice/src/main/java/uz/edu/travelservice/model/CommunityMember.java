package uz.edu.travelservice.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import uz.edu.travelservice.model.address.Address;
import uz.edu.travelservice.model.generator.IdGenerator;

import javax.persistence.*;
import java.util.List;
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CommunityMember extends IdGenerator {

    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "birth_day")
    private String birthDay;
    @Column(name= "nick_name")
    private String nickName;

    @OneToMany(fetch= FetchType.LAZY)
    @Column(name = "address_list")
    @ToString.Exclude
    private List<Address> addresses;

}
