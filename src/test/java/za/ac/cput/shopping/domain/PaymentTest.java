package za.ac.cput.shopping.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.shopping.factory.PaymentFactory;

/**
 * Created by student on 2015/07/31.
 */
public class PaymentTest
{
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void testCreate() throws Exception
    {
        Payment paymnt = PaymentFactory.createPayment("W12324","Cash");

        Assert.assertEquals("Cash", paymnt.getPaymentType());
    }

    @Test
    public void testUpdate() throws Exception
    {
        Payment paymnt = PaymentFactory.createPayment("W12324","Cash");

        Payment newPaymnt = new Payment.Builder(paymnt.getOrderNumber()).paymentType("Credit").build();

        Assert.assertEquals("Cash", paymnt.getPaymentType());
        Assert.assertEquals("Credit", newPaymnt.getPaymentType());
    }
}
