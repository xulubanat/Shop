package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.domain.Users;
import za.ac.cput.shopping.repository.UsersRepo;
import za.ac.cput.shopping.services.UsersServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/06.
 */
@Service
public class UsersServImpl implements UsersServices
{
    @Autowired
    private UsersRepo repository;

    @Override
    public List<Users> getAllUsers() {
        List<Users> allUsers =new ArrayList<>();
        Iterable<Users> users = repository.findAll();
        for (Users user : users)
        {
            allUsers.add(user);
        }
        return allUsers;
    }

    @Override
    public List<Client> getClient(Long id) {
        return repository.findOne(id).getClient();
    }
}
