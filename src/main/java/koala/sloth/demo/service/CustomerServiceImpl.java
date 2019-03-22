package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.respository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer findCustomerbyId(Integer id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteCustomerById(id);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findCustomerbyCategory(String name) {
        List<Customer> customers =  customerRepository.findAll();
        List<Customer> typeList = new ArrayList<>();
        for (Customer c: customers) {
            if(c.getNAME().equals(name)){
                typeList.add(c);
            }
        }
        return typeList;
    }


    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    @Override
    public void addCustomerToFridge(String type) {
        List<Customer> customers =  findCustomerbyCategory(type);
        customers.get(0).setInTheFridge(1);
        Date date = new Date();
        long firstDate=date.getTime();
        customers.get(0).setFIRST_DATE(firstDate);
        customerRepository.save(customers.get(0));
    }


    @Override
    public void deleteCustomerInFridge(String type) {
        List<Customer> customers =  findCustomerbyCategory(type);
        customers.get(0).setInTheFridge(0);
        customers.get(0).setFIRST_DATE((long) 1551615240120L);
        customerRepository.save(customers.get(0));
    }


    @Override
    public  List<Customer> getAllCustomersFromFridge() {
        List<Customer> customers = findAllCustomers();
        List<Customer> typeList = new ArrayList<>();
        for (Customer c: customers) {
            if(c.getInTheFridge()==1){
                typeList.add(c);
            }
        }
        return typeList;
    }



}
