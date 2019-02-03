package koala.sloth.demo.controller;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.service.OrderService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {

    private final OrderService orderService;

    public static final String BASE_URL = "/api/v1/orders";

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    List<Order> getAllCustomers(){
        return orderService.findAllCustomers();
    }


    @GetMapping("/{id}")
    public Order findOrderbyId(@PathVariable Long id){
        return orderService.findOrderbyId(id);
    }

    @Modifying
    @GetMapping("/update/add/{id}/{customer}")
    public Customer addProductToOrder(@PathVariable Long id ,@PathVariable  Long customer){
        return orderService.addProductToOrder(id,customer);
    }

    @Modifying
    @GetMapping("/update/del/{id}/{customer}")
    public Customer delProductInOrder(@PathVariable Long id ,@PathVariable  Long customer){
        return orderService.delWithCustomer(id,customer);
    }

    @DeleteMapping("/del/{id}")
    public void delOrder(@PathVariable  Long id){
         orderService.delOrder(id);
    }

    @GetMapping("/orderPro/{id}")
    public List<Customer> getOrdersCustomers(@PathVariable Long id){
        return orderService.getOrdersCustomers(id);
    }
}
