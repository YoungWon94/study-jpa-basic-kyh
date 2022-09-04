package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_category")
public class Category {

    @Id @GeneratedValue
    private Long categoryId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parent;

    @ManyToMany(mappedBy = "categories")
    private List<Item> items = new ArrayList<>();

}
