package poly.edu.tv00071_lab7.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "CreateDate")
    private Date createDate = new Date();

    private Boolean available;

    // Mỗi Product thuộc một Category
    @ManyToOne
    @JoinColumn(name = "Categoryid")
    private Category category;
}
