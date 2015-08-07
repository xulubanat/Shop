package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Payment;

/**
 * Created by student on 2015/07/31.
 */
public class PaymentFactory
{
    public static Payment createPayment(String orderNumber, String paymentType)
    {
        Payment payment = new Payment.Builder(orderNumber).paymentType(paymentType).build();
        return payment;
    }
}
