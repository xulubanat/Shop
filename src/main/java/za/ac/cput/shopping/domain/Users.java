package za.ac.cput.shopping.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/07/30.
 */
@Entity
public class Users implements Serializable
{
    @Id
    @Column(name = "UserID")
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String orderNumber;
    @Column(unique = true)
    private String userName;
    private String password;
    //private Boolean acc_is_closed;
    //private String dateAccOpen;
    //private String dateAccClosed;
    @OneToOne(targetEntity = Client.class)
    @JoinColumn(name = "ClientID")
   // @MapKeyJoinColumn(referencedColumnName = "userName")
    private List<Client> client = new ArrayList<Client>();

    private Users() {
    }
    public Users(Builder builder)
    {
     //   userID = builder.userID;
        userName = builder.userName;
        password = builder.password;
        client = builder.client;
        orderNumber = builder.orderNumber;
    }

   /* public Long getUserID() {
        return userID;
    }*/

    public Long getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public List<Client> getClient() {
        return client;
    }

    public static class Builder
    {
        private Long id;
        private String userName;
        private String password;
        private List<Client> client;
        private String orderNumber;

        public Builder(String orderNumber)
        {
            this.orderNumber = orderNumber;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder userName(String value)
        {
            this.userName = value;
            return this;
        }

        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Builder client(List<Client> value)
        {
            this.client = value;
            return this;
        }

        public Builder copy(Users value)
        {
            this.orderNumber = value.getOrderNumber();
            this.userName = value.getUserName();
            this.id = value.getId();
            this.password = value.getPassword();
            this.client = value.getClient();
            return this;
        }
        public Users build()
        {
            return new Users(this);
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
