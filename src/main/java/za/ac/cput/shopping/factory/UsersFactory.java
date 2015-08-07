package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.domain.Users;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/07/30.
 */
public class UsersFactory
{
    public static Users createUser(String orderNumber,Map<String, String> values, List<Client> client)
    {
        Users user = new Users.Builder(orderNumber).userName(values.get("userName")).password(values.get("password")).client(client).build();

        return user;
    }
}
