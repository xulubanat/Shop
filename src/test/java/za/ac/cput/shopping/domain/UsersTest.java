package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.UsersFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/07/30.
 */
public class UsersTest
{
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testCreateUser() throws Exception
    {
        List<Client> clients = new ArrayList<>();
        Map<String, String> values = new HashMap<>();

        values.put("userName", "Txulubana");
        values.put("password", "thando1");

        Users user = UsersFactory.createUser("W12324",values, clients);

        Assert.assertEquals("thando1", user.getPassword());
    }

    @Test
    public void testUpdateUser() throws Exception
    {
        List<Client> clients = new ArrayList<>();
        Map<String, String> values = new HashMap<>();

        values.put("userName", "Txulubana");
        values.put("password", "thando1");

        Users user = UsersFactory.createUser("W12324",values, clients);

        Users newUser = new Users.Builder(user.getUserName()).copy(user).password("newPass").build();

        Assert.assertEquals("Txulubana", newUser.getUserName());
        Assert.assertEquals("thando1", user.getPassword());
        Assert.assertEquals("newPass", newUser.getPassword());
    }
}
