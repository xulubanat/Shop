package za.ac.cput.shopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Brands;
import za.ac.cput.shopping.factory.BrandsFactory;

/**
 * Created by student on 2015/08/06.
 */@SpringApplicationConfiguration(classes = App.class)
   @WebAppConfiguration
   public class BrandsCrudTest extends AbstractTestNGSpringContextTests
{
    private Long id;

    @Autowired
    private BrandsRepo repository;

    @Test
    public void create() throws Exception
    {
        Brands brand = BrandsFactory.createBrand("BMW", "bmw.jpg", "bmwrate.jpg");
        repository.save(brand);
        id = brand.getId();
        Assert.assertNotNull(brand);

        //Brands newBrand = new Brands.Builder("Merc").brandImage("merc.jpg").ratingPic("mercrate.jpg").build();
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {
        Brands brands = repository.findOne(id);
        Assert.assertNotNull(brands);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception
    {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        Brands brands = repository.findOne(id);
        repository.delete(brands);
        Brands deleteBrand = repository.findOne(id);
        Assert.assertNull(deleteBrand);
    }
}