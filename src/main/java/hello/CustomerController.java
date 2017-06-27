package hello;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {

	

		@Resource
		CustomerRepository repository;

			
		@RequestMapping("/customer")
		public String fetchCustomers(Model model) {
			model.addAttribute("customersAsCollection", repository.findAll());
			return "customer";
		}
		
//		@RequestMapping("/onecustomer")
//	    public String fetchOne(Model model){
//	         model.addAttribute("onecustomer", repository.findByLastName(lastName));
//	         return "onereview";
		
}