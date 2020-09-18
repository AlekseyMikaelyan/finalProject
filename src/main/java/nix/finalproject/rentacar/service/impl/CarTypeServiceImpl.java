package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.CarType;
import nix.finalproject.rentacar.repository.CarTypeRepository;
import nix.finalproject.rentacar.service.interfaces.CarTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarTypeServiceImpl implements CarTypeService {

    private final CarTypeRepository carTypeRepository;

    @Autowired
    public CarTypeServiceImpl(CarTypeRepository carTypeRepository) {
        this.carTypeRepository = carTypeRepository;
    }

    @Override
    public List<CarType> findAll() {
        return carTypeRepository.findAll();
    }

    @Override
    public CarType findById(Long id) {
        return carTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("Type with id - " + id + " does not exist!"));
    }
}
