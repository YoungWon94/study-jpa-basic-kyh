package entity;

import javax.persistence.*;

@Entity
@Table(name = "t_order_item")
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "order_price")
    private Integer orderPrice;
    private Integer count;
}
