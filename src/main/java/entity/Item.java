package entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_item")
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long itemId;

    private String name;
    private Integer price;
    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @ManyToMany
    @JoinColumn(name = "category_id")
    private List<Category> categories = new ArrayList<>();



}
