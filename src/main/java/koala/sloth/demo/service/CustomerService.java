package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerbyId(Long id);

    List<Customer> findCustomerbyType(String type);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);
}
