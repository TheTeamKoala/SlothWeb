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
    public Order findOrderbyId(Integer id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public void delOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findAllOrder() {
        return orderRepository.findAll();
    }


}
