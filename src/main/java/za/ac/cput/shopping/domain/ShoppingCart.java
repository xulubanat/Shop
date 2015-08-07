package za.ac.cput.shopping.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/08/04.
 */
public class ShoppingCart implements Serializable
{
    private String dateCreated;
    private List<Products> product;
    private String checkout;
    private int quantity;

}
