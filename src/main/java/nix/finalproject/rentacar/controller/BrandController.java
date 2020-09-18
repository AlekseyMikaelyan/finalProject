//package nix.finalproject.rentacar.controller;
//
//import nix.finalproject.rentacar.entity.Brand;
//import nix.finalproject.rentacar.service.interfaces.BrandService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.awt.*;
//import java.util.List;
//
//@RestController
//@RequestMapping("/brands")
//public class BrandController {
//
//    private final BrandService brandService;
//
//    @Autowired
//    public BrandController(BrandService brandService) {
//        this.brandService = brandService;
//    }
//
//    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Brand> findAll() {
//        return brandService.findAll();
//    }
//
//    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public Brand findById(@PathVariable("id") Long id) {
//        return brandService.findById(id);
//    }
//}
