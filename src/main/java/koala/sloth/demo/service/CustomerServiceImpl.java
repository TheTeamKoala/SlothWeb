package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.respository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void addCustomerToFridge(String type) {
        List<Customer> customers =  findCustomerbyType(type);
        customers.get(0).setInTheFridge(true);
        customerRepository.save(customers.get(0));
    }

    @Override
    public  List<Customer> getAllCustomersFromFridge() {
        List<Customer> customers = findAllCustomers();
        List<Customer> typeList = new ArrayList<>();
        for (Customer c: customers) {
            if(c.getInTheFridge()){
                typeList.add(c);
            }
        }
        return typeList;
    }

    @Override
    public void deleteCustomerInFridge(String type) {
        List<Customer> customers =  findCustomerbyType(type);
        customers.get(0).setInTheFridge(false);
        customerRepository.save(customers.get(0));
    }


    @Override
    public Customer findCustomerbyId(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomerById(id);
    }

    @Override
    public List<Customer> findCustomerbyType(String type) {
        List<Customer> customers =  customerRepository.findAll();
        List<Customer> typeList = new ArrayList<>();
        for (Customer c: customers) {
            if(c.getType().equals(type)){
                typeList.add(c);
            }
        }
        return typeList;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
