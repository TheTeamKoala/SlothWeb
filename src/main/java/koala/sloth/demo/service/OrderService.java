package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;

import java.util.List;

public interface OrderService {


    Order findOrderbyId(Long id);

    Customer addProductToOrder(Long id ,Long customer);

    List<Order> findOrderByCystomer(Customer customer);

    void delOrder(Long id);

    Customer delWithCustomer(Long id ,Long customer);

    List<Customer> getOrdersCustomers(Long id);

    List<Order> findAllCustomers();
}
