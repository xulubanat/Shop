package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Categories;

/**
 * Created by student on 2015/07/31.
 */
public class CategoriesFactory {
    public static Categories createCat(String categoryName, String categoryDescr, String categoryPic)
    {
        Categories categories = new Categories.Builder(categoryName).categoryDescr(categoryDescr).categoryPic(categoryPic).build();
        return categories;
    }
}