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
        c1.setFirstName("malik");
        c1.setLastName("turhan");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("yunus");
        c2.setLastName("kep");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("omer");
        c3.setLastName("unal");
        customerRepository.save(c3);

        System.out.println("Customer Saved : "+customerRepository.count());
    }
}
