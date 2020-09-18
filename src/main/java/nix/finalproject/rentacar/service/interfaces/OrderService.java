package nix.finalproject.rentacar.service.interfaces;

import nix.finalproject.rentacar.entity.Order;

import java.util.List;

public interface OrderService extends AbstractService<Order> {

    Order findOrdersByClientId(Long id);

}
