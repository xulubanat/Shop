package za.ac.cput.shopping.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/07/30.
 */
//@Entity
public class Products implements Serializable
{
    //int productID;
   // @Id
    private String productCode;
    private String productName;
    private String productDescr;
    private double productPrice;
    private String productPicture;
    private int views;
    private List<Categories> category;
    private List<Brands> brands;

    private Products()
    {
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescr() {
        return productDescr;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public int getViews() {
        return views;
    }

    public List<Categories> getCategory() {
        return category;
    }

    public List<Brands> getBrands() {
        return brands;
    }

    public Products(Builder builder)
    {
        productCode = builder.productCode;
        productName = builder.productName;
        productDescr = builder.productDescr;
        productPrice = builder.productPrice;
        productPicture = builder.productPicture;
        views = builder.views;
        category = builder.category;
        brands = builder.brands;
    }

    public static class Builder
    {
        private String productCode;
        private String productName;
        private String productDescr;
        private double productPrice;
        private String productPicture;
        private int views;
        private List<Categories> category;
        private List<Brands> brands;

        public Builder(String productCode)
        {
            this.productCode = productCode;
        }

        public Builder productName(String value)
        {
            this.productName = value;
            return this;
        }
        public Builder productDescr(String value)
        {
            this.productDescr = value;
            return this;
        }
        public Builder productPrice(double value)
        {
            this.productPrice = value;
            return this;
        }
        public Builder productPicture(String value)
        {
            this.productPicture = value;
            return this;
        }
        public Builder views(int value)
        {
            this.views = value;
            return this;
        }
        public Builder category(List<Categories> value)
        {
            this.category = value;
            return this;
        }
        public Builder brands(List<Brands> value)
        {
            this.brands = value;
            return this;
        }

        public Builder copy(Products value) {
            this.productCode = value.getProductCode();
            this.productName = value.getProductName();
            this.productDescr = value.getProductDescr();
            this.productPrice = value.getProductPrice();
            this.productPicture = value.getProductPicture();
            this.views = value.getViews();
            this.category = value.getCategory();
            this.brands = value.getBrands();
            return this;
        }
        public Products build()
        {
            return new Products(this);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
