package entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "t_order")
public class Order {

    @Id @GeneratedValue
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
