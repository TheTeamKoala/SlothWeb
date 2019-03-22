package koala.sloth.demo.bootstrap;

import javassist.bytecode.ByteArray;
import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.respository.CustomerRepository;
import koala.sloth.demo.respository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;

@Component
public class bootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;
    public bootStrapData(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Loading customer data");

        Customer c1 = new Customer();
        c1.setNAME("Apple");
        c1.setBRAND("");
        c1.setCATEGORY("Fruit");
        c1.setInTheFridge(0);
        c1.setPRICE((float) 2.00);
        c1.setPRICE_UNIT("TL");
        c1.setPHYSICAL_UNIT("KG");
        c1.setFIRST_DATE((long) 1551615240120L);
        Blob blob = new javax.sql.rowset.serial.SerialBlob(image.getImage("src\\main\\java\\koala\\sloth\\demo\\bootstrap\\images\\apple.jpg"));
        c1.setImage(blob);

        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setNAME("Banana");
        c2.setBRAND("");
        c2.setCATEGORY("Vegetable");
        c2.setInTheFridge(0);
        c2.setPRICE((float) 2.00);
        c2.setPRICE_UNIT("TL");
        c2.setPHYSICAL_UNIT("KG");
        c2.setFIRST_DATE((long) 1551615240120L);
        blob = new javax.sql.rowset.serial.SerialBlob(image.getImage("src\\main\\java\\koala\\sloth\\demo\\bootstrap\\images\\banana.jpg"));
        c2.setImage(blob);
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setNAME("Terderloin");
        c3.setBRAND("");
        c3.setCATEGORY("Meat");
        c3.setInTheFridge(0);
        c3.setPRICE((float) 10.00);
        c3.setPRICE_UNIT("TL");
        c3.setPHYSICAL_UNIT("KG");
        c3.setFIRST_DATE((long) 1551615240120L);
        blob = new javax.sql.rowset.serial.SerialBlob(image.getImage("src\\main\\java\\koala\\sloth\\demo\\bootstrap\\images\\tenderloin.jpg"));
        c3.setImage(blob);
        customerRepository.save(c3);

        Customer c4 = new Customer();
        c4.setNAME("Fanta");
        c4.setBRAND("CocaCola");
        c4.setCATEGORY("Drink");
        c4.setInTheFridge(0);
        c4.setPRICE((float) 3.25);
        c4.setPRICE_UNIT("TL");
        c4.setPHYSICAL_UNIT("piece");
        c4.setFIRST_DATE((long) 1551615240120L);
        blob = new javax.sql.rowset.serial.SerialBlob(image.getImage("src\\main\\java\\koala\\sloth\\demo\\bootstrap\\images\\fanta.jpg"));
        c4.setImage(blob);
        customerRepository.save(c4);

        Customer c5 = new Customer();
        c5.setNAME("Pepsi Cola");
        c5.setBRAND("Pepsi");
        c5.setCATEGORY("Drink");
        c5.setInTheFridge(0);
        c5.setPRICE((float) 3.00);
        c5.setPRICE_UNIT("TL");
        c5.setPHYSICAL_UNIT("piece");
        c5.setFIRST_DATE((long) 1551615240120L);
        blob = new javax.sql.rowset.serial.SerialBlob(image.getImage("src\\main\\java\\koala\\sloth\\demo\\bootstrap\\images\\pepsi_cola.jpg"));
        c5.setImage(blob);
        customerRepository.save(c5);


        System.out.println("Customer Saved : "+customerRepository.count());

    }

}
