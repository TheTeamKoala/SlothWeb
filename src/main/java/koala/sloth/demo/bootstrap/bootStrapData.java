package koala.sloth.demo.bootstrap;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.respository.CustomerRepository;
import koala.sloth.demo.respository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        /*Customer c1 = new Customer();
        c1.setNAME("yogurt");
        c1.setBRAND("sutas");
        c1.setCATEGORY("Hayvansal");
        c1.setInTheFridge(0);
        c1.setPRICE(5);
        c1.setPRICE_UNIT("TL");
        c1.setPHYSICAL_UNIT("KG");
        c1.setFIRST_DATE((long) 222222222);
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setNAME("kola");
        c2.setBRAND("pepsi");
        c2.setCATEGORY("icecek");
        c2.setInTheFridge(0);
        c2.setPRICE(3);
        c2.setPRICE_UNIT("TL");
        c2.setPHYSICAL_UNIT("Birim");
        c2.setFIRST_DATE((long) 3333333);
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setNAME("bal");
        c3.setBRAND("balparmak");
        c3.setCATEGORY("Hayvansal");
        c3.setInTheFridge(1);
        c3.setPRICE(20);
        c3.setPRICE_UNIT("TL");
        c3.setPHYSICAL_UNIT("KG");
        c3.setFIRST_DATE((long) 4444444);
        customerRepository.save(c3);

        System.out.println("Customer Saved : "+customerRepository.count());

        Order o1 = new Order();
        o1.setPRODUCT_ID(1);
        o1.setQUANTITY(3);
        o1.setDATE((long) 333333);
        orderRepository.save(o1);*/
    }
}
