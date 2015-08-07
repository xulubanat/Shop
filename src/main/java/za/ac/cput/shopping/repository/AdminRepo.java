package za.ac.cput.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.shopping.domain.Admin;

/**
 * Created by student on 2015/08/04.
 */
public interface AdminRepo extends CrudRepository<Admin, Long>
{
}
