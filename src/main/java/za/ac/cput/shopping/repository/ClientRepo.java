package za.ac.cput.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.shopping.domain.Client;

/**
 * Created by student on 2015/08/05.
 */
public interface ClientRepo extends CrudRepository<Client, Long>
{
}
