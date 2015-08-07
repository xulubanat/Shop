package za.ac.cput.shopping.repository;

import org.springframework.data.repository.CrudRepository;
import za.ac.cput.shopping.domain.Categories;

/**
 * Created by student on 2015/08/05.
 */
public interface CategoriesRepo extends CrudRepository<Categories, Long>
{
}
