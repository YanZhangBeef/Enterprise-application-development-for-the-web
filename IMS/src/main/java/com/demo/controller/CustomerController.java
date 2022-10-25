package com.demo.controller;
import com.demo.model.Customer;

import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    // Default home path '/' will return view index with message
    @RequestMapping(method = RequestMethod.GET,value="/admin/index")
    public String printAdmin(ModelMap model){

        return "Admin/index";
    }

    @RequestMapping(method = RequestMethod.GET,value="/agent/index")
    public String printAgent(ModelMap model){

        return "Agent/index";
    }
    // When the path is routed to '/home' below method to be called and view returned is home

     //When the path is routed to '/pokemanage' below method to be called and view returned is pokemanage
    @RequestMapping(method = RequestMethod.GET, value = "/admin/customerManage")
    public ModelAndView adminHome() {
        List<Customer> listCustomer = customerService.listAll();
        for (Customer Customer : listCustomer) {
            System.out.println(Customer.toString());
        }
        ModelAndView mav = new ModelAndView("Admin/customerManage");
        mav.addObject("listCustomer", listCustomer);
        return mav;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/agent/customerManage")
    public ModelAndView agentHome() {
        List<Customer> listCustomer = customerService.listAll();
        for (Customer Customer : listCustomer) {
            System.out.println(Customer.toString());
        }
        ModelAndView mav = new ModelAndView("Agent/customerManage");
        mav.addObject("listCustomer", listCustomer);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPokemon
    @RequestMapping(method = RequestMethod.GET, value ="/agent/new")
    public String agentCustomerForm(Map<String, Object> model) {
        Customer customer= new Customer();
        model.put("customer", customer);
        return "Agent/newCustomer";

    }

    @RequestMapping(method = RequestMethod.GET, value ="/admin/new")
    public String adminCustomerForm(Map<String, Object> model) {
        Customer customer= new Customer();
        model.put("customer", customer);
        return "Admin/newCustomer";

    }

    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index
    @RequestMapping(method = RequestMethod.POST, value = "/agent/save")
    public String saveAgentCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/agent/customerManage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/admin/save")
    public String saveAdminCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/admin/customerManage";
    }
    // When the path is routed to '/edit' below method to be called and view returned is editPokemon
    @RequestMapping(method = RequestMethod.GET, value = "/agent/edit")
    public ModelAndView editAgentCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Agent/editCustomer");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin/edit")
    public ModelAndView editAdminCustomerForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Admin/editCustomer");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        return mav;
    }
    // When the path is routed to '/delete' below method to be called and view returned is pokemanage
    @RequestMapping(method = RequestMethod.GET, value ="/admin/delete")
    public String deleteCustomerForm(@RequestParam long id) {
        customerService.delete(id);
        return "redirect:/admin/customerManage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPokemon
    @RequestMapping(method = RequestMethod.GET, value ="/agent/search")
    public ModelAndView agentSearchByName(@RequestParam String name) {
        List<Customer> result = customerService.search(name);
        ModelAndView mav = new ModelAndView("Agent/searchCustomer");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/agent/searchByNumber")
    public ModelAndView agentSearchByNumber(@RequestParam Long id) {
        List<Customer> result = customerService.search(id);
        ModelAndView mav = new ModelAndView("Agent/searchCustomer");
        mav.addObject("result", result);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/admin/searchByNumber")
    public ModelAndView adminSearchByNumber(@RequestParam Long id) {
        List<Customer> result = customerService.search(id);
        ModelAndView mav = new ModelAndView("Admin/searchCustomer");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/admin/search")
    public ModelAndView adminSearchByName(@RequestParam String name) {
        List<Customer> result = customerService.search(name);
        ModelAndView mav = new ModelAndView("Admin/searchCustomer");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin/showDetails")
    public ModelAndView showAdminCustomerDetails(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Admin/customerDetails");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/agent/showDetails")
    public ModelAndView showAgentCustomerDetails(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Agent/customerDetails");
        Customer customer = customerService.get(id);
        mav.addObject("customer", customer);
        return mav;
    }
}

