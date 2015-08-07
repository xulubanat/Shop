package za.ac.cput.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.shopping.domain.Payment;

/**
 * Created by student on 2015/08/06.
 */
public interface PaymentRepo extends CrudRepository<Payment, Long>
{
}
