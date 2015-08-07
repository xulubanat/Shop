package za.ac.cput.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Payment;
import za.ac.cput.shopping.factory.PaymentFactory;
import za.ac.cput.shopping.repository.PaymentRepo;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class PaymentServTest extends AbstractTestNGSpringContextTests
{
    private Long id;

    @Autowired
    private PaymentRepo repository;

    @Test
    public void create() throws Exception
    {
        Payment paymnt = PaymentFactory.createPayment("W12324", "Cash");
        repository.save(paymnt);
        id = paymnt.getId();
        Assert.assertNotNull(paymnt.getId());
    }
}
