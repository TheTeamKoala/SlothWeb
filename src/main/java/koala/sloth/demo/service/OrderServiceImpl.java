package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.respository.CustomerRepository;
import koala.sloth.demo.respository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository ;
    private final CustomerService customerService;


    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository, CustomerService customerService) {
        this.orderRepository = orderRepository;
        this.customerService = customerService;
    }

    @Override
    public Order findOrderbyId(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public Customer delWithCustomer(Long id ,Long customer) {
        Order order = orderRepository.findById(id).get();
        order.getOrder_list().remove(customer);
            orderRepository.save(order);
            return customerService.findCustomerbyId(customer);
    }

    @Override
    public List<Customer> getOrdersCustomers(Long id) {
        Order order = orderRepository.findById(id).get();
        List<Customer> customers = new ArrayList<>();
            for (Long l : order.getOrder_list()){
                Customer c = customerService.findCustomerbyId(l);
                customers.add(c);
            }
        return customers;
    }

    @Override
    public List<Order> findAllCustomers() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findOrderByCystomer(Customer customer) {
        List<Order> order = orderRepository.findAll();
        List<Order> typeList = new ArrayList<>();
        for (Order c: order) {
            if(c.getOrder_list().equals(customer)){
                typeList.add(c);
            }
        }
        return typeList;
    }

    @Override
    public Customer addProductToOrder(Long id ,Long customer) {
        Order order = orderRepository.findById(id).get();
            order.getOrder_list().add(customer);
            orderRepository.save(order);
        return customerService.findCustomerbyId(customer);
    }


    @Override
    public void delOrder(Long id) {
         orderRepository.deleteById(id);
    }
}
