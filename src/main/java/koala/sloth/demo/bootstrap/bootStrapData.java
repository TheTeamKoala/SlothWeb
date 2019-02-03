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

        Customer c1 = new Customer();
        c1.setFirstDate("21.01.2019");
        c1.setType("yogurt");
        c1.setInTheFridge(false);
        c1.setFiyat(5);
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstDate("23.01.2019");
        c2.setType("kola");
        c2.setInTheFridge(false);
        c2.setFiyat(10);
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstDate("25.01.2019");
        c3.setType("bal");
        c3.setInTheFridge(false);
        c3.setFiyat(8);
        customerRepository.save(c3);

        System.out.println("Customer Saved : "+customerRepository.count());

        Order o1 = new Order();
        o1.setOrderFinish(false);
        o1.getOrder_list().add(c1.getId());
        orderRepository.save(o1);
    }
}
