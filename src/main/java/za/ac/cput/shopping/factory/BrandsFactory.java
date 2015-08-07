package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Brands;

/**
 * Created by student on 2015/07/31.
 */
public class BrandsFactory {
    public static Brands createBrand(String brandName, String brandImage, String ratingPic) {
        Brands brand = new Brands.Builder(brandName).brandImage(brandImage).ratingPic(ratingPic).build();
        return brand;
    }
}