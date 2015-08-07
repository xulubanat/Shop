package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Payment;
import za.ac.cput.shopping.repository.PaymentRepo;
import za.ac.cput.shopping.services.PaymentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/06.
 */
@Service
public class PaymentServImpl implements PaymentService
{
    @Autowired
    PaymentRepo repository;

    @Override
    public List<Payment> getPayment() {
        List<Payment> allPayments = new ArrayList<>();

        Iterable<Payment> payments = repository.findAll();
        for(Payment payment : payments)
        {
            allPayments.add(payment);
        }
        return allPayments;
    }
}
