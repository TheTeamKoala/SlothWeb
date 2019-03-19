package koala.sloth.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer PRODUCT_ID;
    private Integer QUANTITY;
    private Long DATE;
}
