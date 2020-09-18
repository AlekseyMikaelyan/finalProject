package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.EngineType;
import nix.finalproject.rentacar.repository.EngineTypeRepository;
import nix.finalproject.rentacar.service.interfaces.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineTypeServiceImpl implements EngineTypeService {

    private final EngineTypeRepository engineTypeRepository;

    @Autowired
    public EngineTypeServiceImpl(EngineTypeRepository engineTypeRepository) {
        this.engineTypeRepository = engineTypeRepository;
    }

    @Override
    public List<EngineType> findAll() {
        return engineTypeRepository.findAll();
    }

    @Override
    public EngineType findById(Long id) {
        return engineTypeRepository.findById(id).orElseThrow(() -> new RuntimeException("Type of engine with id - " + id + " does not exist!"));
    }
}
