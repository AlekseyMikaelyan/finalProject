package nix.finalproject.rentacar.repository;

import nix.finalproject.rentacar.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientByOrderId(Long id);
}
