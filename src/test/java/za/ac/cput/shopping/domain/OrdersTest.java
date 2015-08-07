package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.OrdersFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/07/31.
 */
public class OrdersTest
{
    @Before
    public void setUp() throws Exception
    {
    }
    @Test
    public void testCreate() throws Exception
    {
        Map<String, String> values = new HashMap<>();
        Map<String, String> address = new HashMap<>();
        List<Users> user = new ArrayList<>();
        List<Payment> paymnt = new ArrayList<>();

        values.put("orderNumber", "W12324");
        values.put("status", "out for delivery");

        address.put("billingAddr", "54 smith street, Glenwood ,cape town");
        address.put("shippingAddr", "54 smith street, Glenwood ,cape town");

        Orders orders = OrdersFactory.createOrder(values,"12-August-2014",address, 200.23);//, user, paymnt);

        Assert.assertEquals("12-August-2014", orders.getOrderDate());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Map<String, String> values = new HashMap<>();
        Map<String, String> address = new HashMap<>();
        List<Users> user = new ArrayList<>();
        List<Payment> paymnt = new ArrayList<>();

        values.put("orderNumber", "W12324");
        values.put("status", "out for delivery");

        address.put("billingAddr", "54 smith street, Glenwood ,cape town");
        address.put("shippingAddr", "54 smith street, Glenwood ,cape town");

        Orders orders = OrdersFactory.createOrder(values,"12-August-2014",address, 200.23);//, user, paymnt);

        Orders newOrders = new Orders.Builder(orders.getOrderNumber()).copy(orders).amount(201.23).build();

        Assert.assertEquals("12-August-2014", orders.getOrderDate());
        Assert.assertEquals("12-August-2014", newOrders.getOrderDate());
        Assert.assertEquals(String.valueOf(200.23), String.valueOf(orders.getAmount()));
        Assert.assertEquals(String.valueOf(201.23), String.valueOf(newOrders.getAmount()));
    }
}
