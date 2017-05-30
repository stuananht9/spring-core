package bean;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by tuananh on 05/30/17.
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> customerList =
                new ArrayList<Customer>();
        for (int i = 1; i <= 10; i++) {
            Customer customer = new Customer(String.valueOf(i),
                    "Name " + i, i + " Quang Trung");
            customerList.add(customer);
        }
        return customerList;
    }
}
