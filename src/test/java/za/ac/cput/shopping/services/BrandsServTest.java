package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Brands;
import za.ac.cput.shopping.factory.BrandsFactory;
import za.ac.cput.shopping.repository.BrandsRepo;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration

public class BrandsServTest extends AbstractTestNGSpringContextTests
{
    //@Autowired
    //private BrandsServices service;
    private Long id;

    @Autowired
    private BrandsRepo repository;

    @Test
    public void create() throws Exception
    {
        Brands brand = BrandsFactory.createBrand("VW", "VW.jpg", "rateVW.jpg");
        repository.save(brand);
        id = brand.getId();
        Assert.assertNotNull(brand.getId());
    }
}
