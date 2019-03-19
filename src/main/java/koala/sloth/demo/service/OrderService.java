package koala.sloth.demo.service;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;

import java.util.List;

public interface OrderService {


    Order findOrderbyId(Integer id);

    void delOrder(Integer id);

    Order saveOrder(Order order);

    List<Order> findAllOrder();


}
