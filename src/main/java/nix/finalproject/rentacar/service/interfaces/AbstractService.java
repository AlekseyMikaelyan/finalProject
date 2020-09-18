package nix.finalproject.rentacar.service.interfaces;

import java.util.List;

public interface AbstractService<T> {
    List<T> findAll();
    T findById(Long id);
}
