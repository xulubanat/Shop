package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.repository.ClientRepo;
import za.ac.cput.shopping.services.ClientService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/05.
 */
@Service
public class ClientServImpl implements ClientService
{
    @Autowired
    ClientRepo repository;

    @Override
    public List<Client> getClient() {
        List<Client> allClients = new ArrayList<>();

        Iterable<Client> clients = repository.findAll();
        for(Client client : clients)
        {
            allClients.add(client);
        }
        return allClients;
    }
}
