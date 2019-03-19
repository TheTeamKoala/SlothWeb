package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface CustomerService {
    Customer findCustomerbyId(Integer id);

    void deleteCustomer(Integer id);

    List<Customer> findAllCustomers();

    List<Customer> findCustomerbyCategory(String NAME);

    Customer saveCustomer(Customer customer);

    @Modifying
    void addCustomerToFridge(String CATEGORY);

    @Modifying
    void deleteCustomerInFridge(String CATEGORY);

    List<Customer> getAllCustomersFromFridge();

}
