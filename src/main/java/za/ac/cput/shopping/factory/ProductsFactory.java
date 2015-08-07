package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Brands;
import za.ac.cput.shopping.domain.Categories;
import za.ac.cput.shopping.domain.Products;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/08/04.
 */
public class ProductsFactory
{
    public static Products createProducts(Map<String, String> prodValues, String productDescr,double productPrice, String productPicture, int views, List<Categories> category, List<Brands> brands)
    {
        Products product = new Products.Builder(prodValues.get("productCode")).productName(prodValues.get("productName")).productDescr(productDescr).productPrice(productPrice).productPicture(productPicture).views(views).category(category).brands(brands).build();
        return product;
    }
}