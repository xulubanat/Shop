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
public class Admin implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adminUserName;
    private String adminPassword;

    private Admin() {
    }

    public Admin(Builder builder)
    {
        id = builder.id;
        adminUserName = builder.adminUserName;
        adminPassword = builder.adminPassword;
    }

    public Long getId() {
        return id;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public static  class Builder
    {
        private Long id;
        private String adminUserName;
        private String adminPassword;

        public Builder(String adminName)
        {
            this.adminUserName = adminName;
        }


        public Builder adminPassword(String value)
        {
            this.adminPassword = value;
            return this;
        }
        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder copy(Admin value)
        {
            this.id = value.getId();
            this.adminUserName = value.getAdminUserName();
            this.adminPassword =value.getAdminPassword();

            return this;
        }
        public Admin build()
        {
            return new Admin(this);
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
