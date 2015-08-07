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
public class Payment implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paymentType;
    private String orderNumber;

    public Payment()
    {
    }

    public Long getId() {
        return id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Payment(Builder builder)
    {
        orderNumber = builder.orderNumber;
        id = builder.id;
        paymentType = builder.paymentType;
    }

    public static class Builder
    {
        private String orderNumber;
        private Long id;
        private String paymentType;

        public Builder(String orderNumber)
        {
            this.orderNumber = orderNumber;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }
        public Builder paymentType(String value)
        {
            this.paymentType = value;
            return this;
        }
        public Builder copy(Payment value)
        {
            this.id = value.getId();
            this.paymentType = value.getPaymentType();
            this.orderNumber = value.getOrderNumber();
            return this;
        }
        public Payment build()
        {
            return new Payment(this);
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
