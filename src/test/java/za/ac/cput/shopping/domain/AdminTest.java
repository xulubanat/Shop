package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.AdminFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/07/31.
 */
public class AdminTest
{
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCreate() throws Exception
    {
        Map<String,String> values = new HashMap<>();

        values.put("adminUserName", "admin12");
        values.put("adminPassword", "admin12");

        Admin admin = AdminFactory.createAdmin(values);

        Assert.assertEquals("admin12", admin.getAdminPassword());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Map<String,String> values = new HashMap<>();

        values.put("adminUserName", "admin12");
        values.put("adminPassword", "admin12");

        Admin admin = AdminFactory.createAdmin(values);

        Admin newAdmin = new Admin.Builder(admin.getAdminUserName()).adminPassword("admin").build();

        Assert.assertEquals("admin12", admin.getAdminPassword());
        Assert.assertEquals("admin", newAdmin.getAdminPassword());
    }
}
