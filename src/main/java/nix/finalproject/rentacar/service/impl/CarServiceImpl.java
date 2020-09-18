package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.*;
import nix.finalproject.rentacar.repository.CarRepository;
import nix.finalproject.rentacar.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllByEngineType(EngineType type) {
        return carRepository.findAllByEngineType(type);
    }

    @Override
    public List<Car> findAllByCarStatus(CarStatus status) {
        return carRepository.findAllByCarStatus(status);
    }

    @Override
    public List<Car> findAllByBrand(Brand brand) {
        return carRepository.findAllByBrand(brand);
    }

    @Override
    public List<Car> findAllByCarType(CarType bodyType) {
        return carRepository.findAllByCarType(bodyType);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car with id - " + id + " does not exist!"));
    }
}
