package entity;

import javax.persistence.*;

@Entity
@Table(name = "t_order_item")
public class OrderItem {

    @Id @GeneratedValue
    private Long OrderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer orderPrice;
    private Integer count;
}
