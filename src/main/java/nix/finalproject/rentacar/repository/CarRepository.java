package nix.finalproject.rentacar.repository;

import nix.finalproject.rentacar.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByEngineType(EngineType type);
    List<Car> findAllByCarStatus(CarStatus status);
    List<Car> findAllByBrand(Brand brand);
    List<Car> findAllByCarType(CarType bodyType);
}
