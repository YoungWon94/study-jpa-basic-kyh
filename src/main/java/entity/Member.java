package entity;

import javax.persistence.*;

@Entity
@Table(name = "t_member")
public class Member {

    @Id @GeneratedValue
    private Long memberId;

    private String name;
    private String city;
    private String street;
    private String zipcode;

}
