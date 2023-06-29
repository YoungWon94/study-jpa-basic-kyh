package _01_casecade;

import javax.persistence.*;

@Entity
@Table(name = "t_child")
public class Child {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}