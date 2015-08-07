package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.domain.Users;
import za.ac.cput.shopping.factory.ClientFactory;
import za.ac.cput.shopping.factory.UsersFactory;
import za.ac.cput.shopping.repository.UsersRepo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/08/07.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class UsersServTest extends AbstractTestNGSpringContextTests {
    private Long id;

    private List<Client> clients;
    private Users user;

    @Autowired
    private UsersRepo repository;

    @BeforeMethod
    public void setUp() throws Exception {
        clients = new ArrayList<>();
    }

    @Test
    public void create() throws Exception {
        Map<String, String> fullN = new HashMap<>();
        Map<String, String> contactDet = new HashMap<>();
        Map<String, String> Add1 = new HashMap<>();
        Map<String, String> Add2 = new HashMap<>();
        Map<String, String> values = new HashMap<>();

        fullN.put("fName", "thando");
        fullN.put("lName", "xulubana");

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
        user = UsersFactory.createUser("W12324", values, user.getClient());

        repository.save(user);
        id = user.getId();
        id = client.getId();
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(client.getId());
    }
}