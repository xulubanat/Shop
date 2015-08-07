package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.ClientFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/07/30.
 */
public class ClientTest
{
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testCreata() throws Exception
    {
        Map<String,String> fullN = new HashMap<>();
        Map<String,String> contactDet = new HashMap<>();
        Map<String,String> Add1 = new HashMap<>();
        Map<String,String> Add2 = new HashMap<>();

        fullN.put("fName", "thando");
        fullN.put("lName","xulubana");

        contactDet.put("contactNo", "0735484121");
        contactDet.put("emailAddress", "xulut@yahoo.com");

        Add1.put("streetName", "34 Smith street");
        Add1.put("suburb", "Glenwood");

        Add2.put("city", "Cape town");
        Add2.put("country", "South Africa");


        Client clients = ClientFactory.createClient("Txulubana", fullN, contactDet, Add1, Add2, 7540);

        Assert.assertEquals(7540, clients.getPostcode());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Map<String,String> fullN = new HashMap<>();
        Map<String,String> contactDet = new HashMap<>();
        Map<String,String> Add1 = new HashMap<>();
        Map<String,String> Add2 = new HashMap<>();

        fullN.put("fName", "thando");
        fullN.put("lName","xulubana");

        contactDet.put("contactNo", "0735484121");
        contactDet.put("emailAddress", "xulut@yahoo.com");

        Add1.put("streetName", "34 Smith street");
        Add1.put("suburb", "Glenwood");

        Add2.put("city", "Cape town");
        Add2.put("country", "South Africa");


        Client clients = ClientFactory.createClient( "Txulubana",fullN,contactDet, Add1, Add2, 7540);

        Client newClients = new Client.Builder(clients.getfName()).copy(clients).lName("xulu").build();

        Assert.assertEquals("xulu", newClients.getlName());
        Assert.assertEquals("xulubana", clients.getlName());
    }
}
