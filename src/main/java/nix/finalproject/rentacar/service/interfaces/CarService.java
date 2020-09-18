package nix.finalproject.rentacar.service.interfaces;

import nix.finalproject.rentacar.entity.*;

import java.util.List;

public interface CarService extends AbstractService<Car> {

    List<Car> findAllByEngineType(EngineType type);
    List<Car> findAllByCarStatus(CarStatus status);
    List<Car> findAllByBrand(Brand brand);
    List<Car> findAllByCarType(CarType bodyType);

}
