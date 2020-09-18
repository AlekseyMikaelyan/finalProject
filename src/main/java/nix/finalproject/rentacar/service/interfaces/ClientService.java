package nix.finalproject.rentacar.service.interfaces;

import nix.finalproject.rentacar.entity.Client;

import java.util.List;

public interface ClientService extends AbstractService<Client> {

    Client findClientByOrderId(Long id);

}
