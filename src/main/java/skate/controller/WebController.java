/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Apr 18, 2022
 */
package skate.controller;
import skate.repository.CustomerRepository;
import skate.beans.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WebController {
    CustomerRepository repo;
    //Method that maps to the results page to view all the results
    @GetMapping("/viewAll")
    public String viewAllCustomers(Model model) {
        //If statement checking if the db is empty, and if so it is going to the add method, then to the input page. 
        if(repo.findAll().isEmpty()) { 
            return addNewCustomer(model); 
        }
        model.addAttribute("customer", repo.findAll());
        return "results";
    }

    //Method that maps to input page to add a new customer to db
    @GetMapping("/inputCustomer")
    public String addNewCustomer(Model model) {
        Customer c = new Customer();

        model.addAttribute("newCustomer", c);
        return "input"; 
    }

}

