package entity;

import javax.persistence.*;

@Entity
@Table(name = "t_delivery")
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long deliveryId;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

}
