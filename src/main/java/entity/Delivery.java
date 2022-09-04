package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_delivery")
public class Delivery {

    @Id @GeneratedValue
    private Long deliveryId;

    private String city;
    private String street;
    private String zipcode;

    private DeliveryStatus status;

}
