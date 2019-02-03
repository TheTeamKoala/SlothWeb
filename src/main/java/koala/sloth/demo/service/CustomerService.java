package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface CustomerService {
    Customer findCustomerbyId(Long id);

    List<Customer> findCustomerbyType(String type);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);

    @Modifying
    void addCustomerToFridge(String type);

    @Modifying
    void deleteCustomerInFridge(String type);

    List<Customer> getAllCustomersFromFridge();
}
