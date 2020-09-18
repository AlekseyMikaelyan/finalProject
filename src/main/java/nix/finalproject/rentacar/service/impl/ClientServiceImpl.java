package nix.finalproject.rentacar.service.impl;

import nix.finalproject.rentacar.entity.Client;
import nix.finalproject.rentacar.repository.ClientRepository;
import nix.finalproject.rentacar.service.interfaces.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client findClientByOrderId(Long id) {
        return clientRepository.findClientByOrderId(id);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client with id - " + id + " does not exist!"));
    }
}
