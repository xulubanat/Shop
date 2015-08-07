package za.ac.cput.shopping.factory;

import za.ac.cput.shopping.domain.Orders;
import za.ac.cput.shopping.domain.Payment;
import za.ac.cput.shopping.domain.Users;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/07/31.
 */
public class OrdersFactory
{
   public static Orders createOrder(Map<String, String> values, String orderDate, Map<String, String> address,double amount)//,List<Users> user, List<Payment> paymnt)
   {
       Orders order = new Orders.Builder(values.get("orderNumber")).status(values.get("status")).orderDate(orderDate).shippingAddr(address.get("shippingAddr")).billingAddr(address.get("billingAddr")).amount(amount).build();//.user(user).paymnt(paymnt).build();
       return order;
   }
}