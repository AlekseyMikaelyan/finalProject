package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.CarStatus;
import nix.finalproject.rentacar.repository.CarStatusRepository;
import nix.finalproject.rentacar.service.interfaces.CarStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarStatusServiceImpl implements CarStatusService {

    private final CarStatusRepository carStatusRepository;

    @Autowired
    public CarStatusServiceImpl(CarStatusRepository carStatusRepository) {
        this.carStatusRepository = carStatusRepository;
    }

    @Override
    public List<CarStatus> findAll() {
        return carStatusRepository.findAll();
    }

    @Override
    public CarStatus findById(Long id) {
        return carStatusRepository.findById(id).orElseThrow(() -> new RuntimeException("Status with id - " + id + " does not exist!"));
    }
}
