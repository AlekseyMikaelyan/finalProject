package nix.finalproject.rentacar.repository;

import nix.finalproject.rentacar.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findOrdersByClientId(Long id);
}
