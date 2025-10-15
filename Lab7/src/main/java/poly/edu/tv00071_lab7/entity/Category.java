package poly.edu.tv00071_lab7.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable {
    @Id
    private String id;

    private String name;

    // Liên kết 1-nhiều với Product
    @OneToMany(mappedBy = "category")
    List<Product> products;
}
