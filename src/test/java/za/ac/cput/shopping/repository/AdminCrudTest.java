package za.ac.cput.shopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Admin;
import za.ac.cput.shopping.factory.AdminFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AdminCrudTest extends AbstractTestNGSpringContextTests
{
    private Long id;

    @Autowired
    private AdminRepo repository;

    @Test
    public void create() throws Exception
    {
        Map<String,String> values = new HashMap<>();

        values.put("adminUserName", "admin14");
        values.put("adminPassword", "admin14");

        Admin admin = AdminFactory.createAdmin(values);
        repository.save(admin);
        id=admin.getId();
        Assert.assertNotNull(admin.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {
        Admin admin = repository.findOne(id);
        Assert.assertNotNull(admin.getId());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception
    {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        Admin admin = repository.findOne(id);
        repository.delete(admin);
        Admin deleteAdmin = repository.findOne(id);
        Assert.assertNull(deleteAdmin);
    }
}
