package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Categories;
import za.ac.cput.shopping.factory.CategoriesFactory;
import za.ac.cput.shopping.repository.CategoriesRepo;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class CategoriesServTest extends AbstractTestNGSpringContextTests
{
    private Long id;

    @Autowired
    private CategoriesRepo repository;

    @Test
    public void create() throws Exception
    {
        Categories cat = CategoriesFactory.createCat("mats", "Just mats", "mats.jpg");
        repository.save(cat);
        id = cat.getId();
        Assert.assertNotNull(cat.getId());
    }
}