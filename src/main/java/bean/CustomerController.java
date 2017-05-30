package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

/**
 * Created by tuananh on 05/30/17.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService service;

    public ArrayList<Customer> getAll() {
        return service.getAll();
    }
}
