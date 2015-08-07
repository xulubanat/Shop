package za.ac.cput.shopping.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.shopping.App;
import za.ac.cput.shopping.domain.Payment;
import za.ac.cput.shopping.factory.PaymentFactory;

/**
 * Created by student on 2015/08/06.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class PaymentCrudTest extends AbstractTestNGSpringContextTests
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

    @Test(dependsOnMethods = "create")
    public void read() throws Exception
    {
        Payment paymnt = repository.findOne(id);
        Assert.assertNotNull(paymnt);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception
    {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception
    {
        Payment paymnt = repository.findOne(id);
        repository.delete(paymnt);
        Payment deletePayment = repository.findOne(id);
        Assert.assertNull(deletePayment);
    }
}
