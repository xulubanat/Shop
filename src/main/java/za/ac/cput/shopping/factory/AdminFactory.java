package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Admin;

import java.util.Map;

/**
 * Created by student on 2015/07/31.
 */
public class AdminFactory
{
    public static Admin createAdmin(Map<String, String> values)
    {
        Admin admin = new Admin.Builder(values.get("adminUserName")).adminPassword(values.get("adminPassword")).build();

        return admin;
    }
}