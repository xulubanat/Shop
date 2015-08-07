package za.ac.cput.shopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Categories;
import za.ac.cput.shopping.factory.CategoriesFactory;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class CategoriesCrudTest extends AbstractTestNGSpringContextTests
{
    private Long id;
    @Autowired
    private CategoriesRepo repository;

    @Test
    public void create() throws Exception
    {
        Categories cat = CategoriesFactory.createCat("Seats", "Just Seats", "Seats.jpg");
        repository.save(cat);
        id = cat.getId();
        Assert.assertNotNull(cat);
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {
        Categories cat = repository.findOne(id);
        Assert.assertNotNull(cat);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception
    {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        Categories cat = repository.findOne(id);
        repository.delete(cat);
        Categories deleteCat = repository.findOne(id);
        Assert.assertNull(deleteCat);
    }
}