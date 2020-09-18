package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.Order;
import nix.finalproject.rentacar.repository.OrderRepository;
import nix.finalproject.rentacar.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findOrdersByClientId(Long id) {
        return orderRepository.findOrdersByClientId(id);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with id - " + id + " does not exist!"));
    }
}
