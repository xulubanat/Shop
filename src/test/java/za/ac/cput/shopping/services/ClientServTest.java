package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Client;
import za.ac.cput.shopping.factory.ClientFactory;
import za.ac.cput.shopping.repository.ClientRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class ClientServTest extends AbstractTestNGSpringContextTests
{
    private Long id;
    @Autowired

    private ClientRepo repository;

    @Test
    public void create() throws Exception
    {
        Map<String,String> fullN = new HashMap<>();
        Map<String,String> contactDet = new HashMap<>();
        Map<String,String> Add1 = new HashMap<>();
        Map<String,String> Add2 = new HashMap<>();

        fullN.put("fName", "thando");
        fullN.put("lName","xulu");

        contactDet.put("contactNo", "0735484121");
        contactDet.put("emailAddress", "xulut@yahoo.com");

        Add1.put("streetName", "34 Smith street");
        Add1.put("suburb", "Glenwood");

        Add2.put("city", "Cape town");
        Add2.put("country", "South Africa");


        Client clients = ClientFactory.createClient("Txulubana", fullN, contactDet, Add1, Add2, 7540);
        repository.save(clients);
        id = clients.getId();
        Assert.assertNotNull(clients.getId());
    }
}

