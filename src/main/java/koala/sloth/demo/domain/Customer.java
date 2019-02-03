package koala.sloth.demo.domain;


import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String type;
    private  String firstDate;
    private Boolean inTheFridge;
    private int fiyat;


}
