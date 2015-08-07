package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Client;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/07/30.
 */
public class ClientFactory
{
    public static Client createClient(String userName,Map<String, String> fullN, Map<String, String> contactDet, Map<String, String> Add1, Map<String, String> Add2, int postcode)
    {
        Client client = new Client.Builder(userName).fName(fullN.get("fName")).lName(fullN.get("lName")).contactNo(contactDet.get("contactNo")).emailAddress(contactDet.get("emailAdress")).streetName(Add1.get("streetName")).suburb(Add1.get("suburb")).city(Add2.get("city")).country(Add2.get("country")).postcode(postcode).build();

        return client;
    }
}