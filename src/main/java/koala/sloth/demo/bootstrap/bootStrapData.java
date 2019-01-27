package koala.sloth.demo.bootstrap;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.respository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public bootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       System.out.println("Loading customer data");

        Customer c1 = new Customer();
        c1.setFirstDate("21.01.2019");
        c1.setType("yogurt");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstDate("23.01.2019");
        c2.setType("kola");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstDate("25.01.2019");
        c3.setType("bal");
        customerRepository.save(c3);

        System.out.println("Customer Saved : "+customerRepository.count());
    }
}
