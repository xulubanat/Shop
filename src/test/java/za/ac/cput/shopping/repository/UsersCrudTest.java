package za.ac.cput.shopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.domain.Users;
import za.ac.cput.shopping.factory.ClientFactory;
import za.ac.cput.shopping.factory.UsersFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class UsersCrudTest extends AbstractTestNGSpringContextTests
{
    private Long id;

    private List<Client> clients;


    @Autowired
    private UsersRepo repository;

    @BeforeMethod
    public void setUp() throws Exception
    {
        clients = new ArrayList<>();
    }

    @Test
    public void create() throws Exception
    {
        Map<String,String> fullN = new HashMap<>();
        Map<String,String> contactDet = new HashMap<>();
        Map<String,String> Add1 = new HashMap<>();
        Map<String,String> Add2 = new HashMap<>();
        Map<String, String> values = new HashMap<>();

        fullN.put("fName", "thando");
        fullN.put("lName","xulubana");

        contactDet.put("contactNo", "0735484121");
        contactDet.put("emailAddress", "xulut@yahoo.com");

        Add1.put("streetName", "34 Smith street");
        Add1.put("suburb", "Glenwood");

        Add2.put("city", "Cape town");
        Add2.put("country", "South Africa");

        values.put("userName", "Txulubana");
        values.put("password", "thando1");

        Client client = ClientFactory.createClient("Txulubana", fullN, contactDet, Add1, Add2, 7540);
        clients.add(client);
        Users user = UsersFactory.createUser("W12324",values, null);

        repository.save(user);
        id = user.getId();
        Assert.assertNotNull(user.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {
        Users user = repository.findOne(id);
        Assert.assertNotNull(user.getId());
       // Assert.assertTrue(user.getClient().size() == 1);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception
    {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        Users user = repository.findOne(id);
        repository.delete(user);
        Users deleteUser = repository.findOne(id);
        Assert.assertNull(deleteUser);
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
}
