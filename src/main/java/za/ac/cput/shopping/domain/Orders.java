package za.ac.cput.shopping.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 2015/07/30.
 */
//@Entity
public class Orders implements Serializable
{
   // @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   // @Column(unique = true)
    private String orderNumber;
    private String orderDate;
    private String billingAddr;
    private String shippingAddr;
    private double amount;
    private String status;
    //@ManyToOne
   // @JoinColumn(name = "order_id")
  //  private List<Users> user;
   // @OneToOne
   // @JoinColumn(name = "order_id")
   // private List<Payment> paymnt;

    private Orders()
    {
    }

    public Long getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getBillingAddr() {
        return billingAddr;
    }

    public String getShippingAddr() {
        return shippingAddr;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

 //   public List<Users> getUser() {
  //      return user;
  //  }

  //  public List<Payment> getPaymnt() {
  //      return paymnt;
  //  }

    public Orders(Builder builder)
    {
        id = builder.id;
        orderNumber = builder.orderNumber;
        orderDate = builder.orderDate;
        billingAddr = builder.billingAddr;
        shippingAddr = builder.shippingAddr;
        amount = builder.amount;
        status = builder.status;
      //  user = builder.user;
     //   paymnt = builder.paymnt;
    }

    public static class Builder
    {
        private Long id;
        private String orderNumber;
        private String orderDate;
        private String billingAddr;
        private String shippingAddr;
        private double amount;
        private String status;
    //    private List<Users> user;
    //    private List<Payment> paymnt;

        public Builder(String orderNumber)
        {
            this.orderNumber = orderNumber;
        }

        public Builder orderDate(String value)
        {
            this.orderDate = value;
            return this;
        }
        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }
        public Builder billingAddr(String value)
        {
            this.billingAddr = value;
            return this;
        }

        public Builder shippingAddr(String value)
        {
            this.shippingAddr = value;
            return this;
        }

        public Builder amount(double value)
        {
            this.amount = value;
            return this;
        }

        public Builder status(String value)
        {
            this.status = value;
            return this;
        }

    /*    public Builder user(List<Users> value)
        {
            this.user = value;
            return this;
        }

        public Builder paymnt(List<Payment> value)
        {
            this.paymnt = value;
            return this;
        }*/

        public Builder copy(Orders value)
        {
            this.id = value.id;
            this.orderNumber = value.getOrderNumber();
            this.orderDate = value.getOrderDate();
            this.billingAddr = value.getBillingAddr();
            this.shippingAddr = value.getShippingAddr();
            this.amount = value.getAmount();
            this.status = value.getStatus();
         //   this.user = value.getUser();
        //    this.paymnt =value.getPaymnt();

            return this;
        }

        public Orders build()
        {
            return new Orders(this);
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
