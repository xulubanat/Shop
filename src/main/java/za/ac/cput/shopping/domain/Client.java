package za.ac.cput.shopping.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by student on 2015/07/30.
 */
@Entity
public class Client implements Serializable
{
    @Id
    @Column(name = "ClientID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String fName;
    private String lName;
    private String contactNo;
    private String emailAddress;
    private String streetName;
    private String suburb;
    private String city;
    private String country;
    private int postcode;

    private Client()
    {
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getPostcode() {
        return postcode;
    }

    public Client(Builder builder)
    {
        id = builder.id;
        userName = builder.userName;
        fName = builder.fName;
        lName = builder.lName;
        contactNo = builder.contactNo;
        emailAddress = builder.emailAddress;
        streetName = builder.streetName;
        suburb = builder.suburb;
        city = builder.city;
        country = builder.country;
        postcode = builder.postcode;
    }
    public static class Builder
    {
        private Long id;
        private String userName;
        private String fName;
        private String lName;
        private String contactNo;
        private String emailAddress;
        private String streetName;
        private String suburb;
        private String city;
        private String country;
        private int postcode;

        public Builder(String userName)
        {
            this.userName = userName;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder emailAddress(String value)
        {
            this.emailAddress = value;
            return this;
        }

        public Builder fName(String value)
        {
            this.fName = value;
            return this;
        }
        public Builder lName(String value)
        {
            this.lName = value;
            return this;
        }
        public Builder contactNo(String value)
        {
            this.contactNo = value;
            return this;
        }
        public Builder streetName(String value)
        {
            this.streetName = value;
            return this;
        }
        public Builder suburb(String value)
        {
            this.suburb = value;
            return this;
        }
        public Builder city(String value)
        {
            this.city = value;
            return this;
        }
        public Builder country(String value)
        {
            this.country = value;
            return this;
        }
        public Builder postcode(int value)
        {
            this.postcode = value;
            return this;
        }
        public Builder copy(Client value)
        {
            this.id = value.id;
            this.userName = value.getUserName();
            this.fName = value.fName;
            this.lName = value.lName;
            this.contactNo = value.contactNo;
            this.emailAddress = value.emailAddress;
            this.streetName = value.streetName;
            this.suburb = value.suburb;
            this.city = value.city;
            this.country = value.country;
            this.postcode = value.postcode;

            return this;
        }

        public Client build()
        {
            return new Client(this);
        }
    }
}
