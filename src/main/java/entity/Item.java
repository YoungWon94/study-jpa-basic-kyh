package entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_item")
public class Item {

    @Id @GeneratedValue
    private Long itemId;

    @ManyToMany
    @JoinColumn(name = "category_id")
    private List<Category> categories = new ArrayList<>();

    private String name;
    private Integer price;
    private Integer stockQuantity;

}
