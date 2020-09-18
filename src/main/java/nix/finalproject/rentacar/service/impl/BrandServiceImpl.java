package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.Brand;
import nix.finalproject.rentacar.repository.BrandRepository;
import nix.finalproject.rentacar.service.interfaces.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand findById(Long id) {
        return brandRepository.findById(id).orElseThrow(() -> new RuntimeException("Brand with id - " + id + " does not exist!"));
    }
}
