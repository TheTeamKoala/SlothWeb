package koala.sloth.demo.domain;


import lombok.*;

import javax.persistence.*;
import java.sql.Blob;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer ID;
    private  String NAME;
    private  String BRAND;
    private  String CATEGORY;
    private  float PRICE;
    private  String PRICE_UNIT;
    private  String PHYSICAL_UNIT;
    private  Long FIRST_DATE;
    private Integer inTheFridge;
    private Blob image;

}
