package za.ac.cput.shopping.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/07/30.
 */
@Entity
public class Brands implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brandName;
    private String brandImage;
    private String ratingPic;

    private Brands()
    {
    }

    public Long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getBrandImage() {
        return brandImage;
    }

    public String getRatingPic() {
        return ratingPic;
    }

    public Brands(Builder builder)
    {
        id = builder.id;
        brandName = builder.brandName;
        brandImage = builder.brandImage;
        ratingPic = builder.ratingPic;
    }

    public static class Builder
    {
        private Long id;
        private String brandName;
        private String brandImage;
        private String ratingPic;

        public Builder(String brandName)
        {
            this.brandName = brandName;
        }

        public Builder brandImage(String value)
        {
            this.brandImage = value;
            return  this;
        }
        public Builder id(Long value)
        {
            this.id = value;
            return  this;
        }
        public Builder ratingPic(String value)
        {
            this.ratingPic = value;
            return  this;
        }

        public Builder copy(Brands value)
        {
            this.id = value.getId();
            this.brandName = value.getBrandName();
            this.brandImage = value.getBrandImage();
            this.ratingPic = value.getRatingPic();

            return  this;
        }

        public Brands build()
        {
            return new Brands(this);
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
