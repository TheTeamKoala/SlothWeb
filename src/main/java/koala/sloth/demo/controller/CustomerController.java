package koala.sloth.demo.controller;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.service.CustomerService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    private final CustomerService customerService;

    static final String BASE_URL = "/product";


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
    return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable  Integer id){
        return customerService.findCustomerbyId(id);
    }

    @GetMapping("/name/{name}")
    public List<Customer> getCustomerByType(@PathVariable  String name){
        return customerService.findCustomerbyCategory(name);
    }

    @Modifying
    @GetMapping("/update/add/{type}")
    public  void addCustomerToFrige(@PathVariable String type){
       customerService.addCustomerToFridge(type);
    }

    @Modifying
    @GetMapping("/update/del/{type}")
    public  void deleteCustomerInFrige(@PathVariable String type){
        customerService.deleteCustomerInFridge(type);
    }

    @GetMapping("/fridge")
    public List<Customer> getCustomerByType(){
        return customerService.getAllCustomersFromFridge();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody  Customer customer){
        return customerService.saveCustomer(customer);
    }

    @DeleteMapping("/del/{id}")
    public void delCustomer(@PathVariable  Integer id){
        customerService.deleteCustomer(id);
    }
}
