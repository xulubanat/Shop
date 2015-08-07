package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Brands;
import za.ac.cput.shopping.repository.BrandsRepo;
import za.ac.cput.shopping.services.BrandsServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/08/04.
 */
@Service
public class BrandsServImpl implements BrandsServices
{
    @Autowired
    BrandsRepo repository;

    @Override
    public List<Brands> getBrands() {
        List<Brands> allBrands = new ArrayList<>();
        Iterable<Brands> brands = repository.findAll();
        for (Brands brand : brands)
        {
            allBrands.add(brand);
        }
        return allBrands;
    }
}
