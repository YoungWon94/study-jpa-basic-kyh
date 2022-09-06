package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_category")
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long categoryId;

    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Item> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory")
    private List<Category> childCategories = new ArrayList<>();



}
