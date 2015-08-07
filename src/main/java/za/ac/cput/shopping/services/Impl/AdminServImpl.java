package za.ac.cput.shopping.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.shopping.domain.Admin;
import za.ac.cput.shopping.repository.AdminRepo;
import za.ac.cput.shopping.services.AdminService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/08/04.
 */
@Service
public class AdminServImpl implements AdminService
{
    @Autowired
    AdminRepo repository;

    @Override
    public List<Admin> getAdmin() {
        List<Admin> allAdmins = new ArrayList<>();

        Iterable<Admin> admins = repository.findAll();
        for(Admin admin : admins)
        {
            allAdmins.add(admin);
        }
        return allAdmins;
    }
}
