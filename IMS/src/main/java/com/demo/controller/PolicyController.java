package com.demo.controller;


import com.demo.model.Customer;
import com.demo.model.Policy;

import com.demo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;
@Controller
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @RequestMapping(method = RequestMethod.GET, value = "/agent/policyManage")
    public ModelAndView agentHome() {
        List<Policy> listPolicy = policyService.listAll();
        for (Policy Policy : listPolicy) {
            System.out.println(Policy.toString());
        }
        ModelAndView mav = new ModelAndView("Agent/policyManage");
        mav.addObject("listPolicy", listPolicy);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin/policyManage")
    public ModelAndView adminHome() {
        List<Policy> listPolicy = policyService.listAll();
        for (Policy Policy : listPolicy) {
            System.out.println(Policy.toString());
        }
        ModelAndView mav = new ModelAndView("Admin/policyManage");
        mav.addObject("listPolicy", listPolicy);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPokemon


    @RequestMapping(method = RequestMethod.GET, value ="/admin/newPolicy")
    public String newAdminPolicyForm(Map<String, Object> model) {
        Policy policy= new Policy();
        model.put("policy", policy);
        return "Admin/newPolicy";

    }
    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index

    @RequestMapping(method = RequestMethod.POST, value = "/admin/savePolicy")
    public String saveAdminPolicy(@ModelAttribute("policy") Policy policy) {
        policyService.save(policy);
        return "redirect:/admin/policyManage";
    }
    // When the path is routed to '/edit' below method to be called and view returned is editPokemon
    @RequestMapping(method = RequestMethod.GET, value = "/admin/editPolicy")
    public ModelAndView editPolicyForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Admin/editPolicy");
        Policy policy = policyService.get(id);
        mav.addObject("policy", policy);
        return mav;
    }


    // When the path is routed to '/delete' below method to be called and view returned is pokemanage
    @RequestMapping(method = RequestMethod.GET, value ="/admin/deletePolicy")
    public String deletePolicyForm(@RequestParam long id) {
        policyService.delete(id);
        return "redirect:/admin/policyManage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPokemon
    @RequestMapping(method = RequestMethod.GET, value ="/admin/searchPolicy")
    public ModelAndView searchAdminPolicy(@RequestParam String number) {
        List<Policy> result = policyService.search(number);
        ModelAndView mav = new ModelAndView("Admin/searchPolicy");
        mav.addObject("result", result);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/agent/searchPolicy")
    public ModelAndView searchAgentPolicy(@RequestParam String number) {
        List<Policy> result = policyService.search(number);
        ModelAndView mav = new ModelAndView("Agent/searchPolicy");
        mav.addObject("result", result);
        return mav;
    }




}

