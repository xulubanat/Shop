package za.ac.cput.shopping.services;

import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.domain.Users;

import java.util.List;

/**
 * Created by student on 2015/08/06.
 */
public interface UsersServices
{
    List<Users> getAllUsers();
    List<Client> getClient(Long id);
}
