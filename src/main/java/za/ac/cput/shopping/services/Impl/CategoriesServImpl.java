package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Categories;
import za.ac.cput.shopping.repository.CategoriesRepo;
import za.ac.cput.shopping.services.CategoriesServices;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/05.
 */
@Service
public class CategoriesServImpl implements CategoriesServices
{
    @Autowired
    CategoriesRepo repository;

    @Override
    public List<Categories> getCat() {
        List<Categories> allCat = new ArrayList<>();

        Iterable<Categories> cats = repository.findAll();
        for(Categories cat : cats)
        {
            allCat.add(cat);
        }
        return allCat;
    }
}
