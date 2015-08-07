package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.CategoriesFactory;

/**
 * Created by student on 2015/07/31.
 */
public class CategoriesTest
{
    @Before
    public void setUp() throws Exception
    {
    }
    private String categoryName;
    private String categoryDescr;
    private String categoryPic;
    @Test
    public void testCreate() throws Exception
    {
        Categories categories = CategoriesFactory.createCat("wheels", "just wheels", "wheels.jpg");

        Assert.assertEquals("wheels", categories.getCategoryName());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Categories categories = CategoriesFactory.createCat("wheels", "just wheels", "wheels.jpg");

        Categories newCat = new Categories.Builder("paint").categoryDescr("just paint").categoryPic("paint.jpg").build();

        Assert.assertEquals("wheels", categories.getCategoryName());
        Assert.assertEquals("paint", newCat.getCategoryName());
        Assert.assertEquals("just wheels", categories.getCategoryDescr());
        Assert.assertEquals("just paint", newCat.getCategoryDescr());
        Assert.assertEquals("wheels.jpg", categories.getCategoryPic());
        Assert.assertEquals("paint.jpg", newCat.getCategoryPic());
    }
}
