package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Admin;
import za.ac.cput.shopping.factory.AdminFactory;
import za.ac.cput.shopping.repository.AdminRepo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AdminServTest extends AbstractTestNGSpringContextTests
{

    // private AdminService service;
    // @Autowired
    private Long id;

    @Autowired
    private AdminRepo repository;

    @BeforeMethod
    public void setUp() throws Exception
    {
    }

    @Test
    public void create() throws Exception
    {
        Map<String,String> values = new HashMap<>();

        values.put("adminUserName", "admin12");
        values.put("adminPassword", "admin12");

        Admin admin = AdminFactory.createAdmin(values);
        repository.save(admin);
        id = admin.getId();
        Assert.assertNotNull(admin.getId());
    }

}
