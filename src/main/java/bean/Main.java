package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by tuananh on 05/30/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        CustomerController customerController =(CustomerController) context.getBean("customerController");
        ArrayList<Customer> customers =
                customerController.getAll();

        for(Customer customer: customers) {
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getAddress());
        }
    }
}
