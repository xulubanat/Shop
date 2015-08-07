package za.ac.cput.shopping.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/07/30.
 */
@Entity
public class Categories implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String categoryName;
    private String categoryDescr;
    private String categoryPic;

    private Categories() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getCategoryDescr() {
        return categoryDescr;
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public Categories(Builder builder)
    {
        id = builder.id;
        categoryName = builder.categoryName;
        categoryDescr = builder.categoryDescr;
        categoryPic = builder.categoryPic;
    }

    public static class Builder
    {
        private Long id;
        private String categoryName;
        private String categoryDescr;
        private String categoryPic;

        public Builder(String categoryName)
        {
            this.categoryName = categoryName;
        }

        public Builder categoryDescr(String value)
        {
            this.categoryDescr = value;
            return this;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder categoryPic(String value)
        {
            this.categoryPic = value;
            return this;
        }

        public Builder copy(Categories value)
        {
            this.id = value.getId();
            this.categoryName = value.getCategoryName();
            this.categoryDescr = value.getCategoryDescr();
            this.categoryPic = value.getCategoryPic();

            return this;
        }
        public Categories build()
        {
            return new Categories(this);
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
