package koala.sloth.demo.controller;

import koala.sloth.demo.domain.Customer;
import koala.sloth.demo.domain.Order;
import koala.sloth.demo.service.OrderService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(OrderController.BASE_URL)
public class OrderController {

    private final OrderService orderService;

    public static final String BASE_URL = "/order";

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public Order findOrderbyId(@PathVariable Integer id){
        return orderService.findOrderbyId(id);
    }

    @DeleteMapping("/del/{id}")
    public void delOrder(@PathVariable  Integer id){
        orderService.delOrder(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order saveOrder(@RequestBody  Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping
    List<Order> getAllOrder(){
        return orderService.findAllOrder();
    }




}
