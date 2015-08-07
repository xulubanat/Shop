package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.ProductsFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/08/04.
 */
public class ProductsTest
{
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testCreate() throws Exception
    {
        Map<String, String> prodVal = new HashMap<>();
        List<Categories> cat = new ArrayList<>();
        List<Brands> brand  = new ArrayList<>();

        prodVal.put("productCode", "WR1203R");
        prodVal.put("productName", "24inc rim");

        Products prod = ProductsFactory.createProducts(prodVal, "24 inc red rims", 1800.00, "red24rims.jpg", 25, cat, brand);

        Assert.assertEquals("24 inc red rims", prod.getProductDescr());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Map<String, String> prodVal = new HashMap<>();
        List<Categories> cat = new ArrayList<>();
        List<Brands> brand  = new ArrayList<>();

        prodVal.put("productCode", "WR1203R");
        prodVal.put("productName", "24inc rim");

        Products prod = ProductsFactory.createProducts(prodVal, "24 inc red rims", 1800.00, "red24rims.jpg", 25, cat, brand);

        Products newProd = new Products.Builder(prod.getProductCode()).copy(prod).productPrice(2999.99).build();

        Assert.assertEquals("24 inc red rims", prod.getProductDescr());
        Assert.assertEquals("24 inc red rims", newProd.getProductDescr());
        Assert.assertEquals(String.valueOf(1800.00),String.valueOf(prod.getProductPrice()));
        Assert.assertEquals(String.valueOf(2999.99), String.valueOf(newProd.getProductPrice()));
    }
}
