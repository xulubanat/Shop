package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.BrandsFactory;

/**
 * Created by student on 2015/07/31.
 */
public class BrandsTest
{
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCreate() throws Exception
    {
        Brands brand = BrandsFactory.createBrand("BMW","bmw.jpg", "bmwrate.jpg");
        Assert.assertEquals("BMW", brand.getBrandName());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Brands brand = BrandsFactory.createBrand("BMW","bmw.jpg", "bmwrate.jpg");

        Brands newBrand = new Brands.Builder("Merc").brandImage("merc.jpg").ratingPic("mercrate.jpg").build();

        Assert.assertEquals("Merc", newBrand.getBrandName());
        Assert.assertEquals("BMW", brand.getBrandName());
        Assert.assertEquals("merc.jpg", newBrand.getBrandImage());
        Assert.assertEquals("bmw.jpg", brand.getBrandImage());
        Assert.assertEquals("mercrate.jpg", newBrand.getRatingPic());
        Assert.assertEquals("bmwrate.jpg",brand.getRatingPic());
    }
}
