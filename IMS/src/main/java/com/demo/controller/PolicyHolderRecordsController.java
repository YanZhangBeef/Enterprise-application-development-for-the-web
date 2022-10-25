package com.demo.controller;


import com.demo.model.Policy;
import com.demo.model.PolicyHolderRecords;

import com.demo.service.PolicyHolderRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Controller
public class PolicyHolderRecordsController {
    @Autowired
    private PolicyHolderRecordsService policyHolderRecordsService;


    @RequestMapping(method = RequestMethod.GET, value = "/agent/policyHolderRecordsManage")
    public ModelAndView agentHome() {
        List<PolicyHolderRecords> listPolicyHolderRecords = policyHolderRecordsService.listAll();
        for (PolicyHolderRecords PolicyHolderRecords : listPolicyHolderRecords) {
            System.out.println(PolicyHolderRecords.toString());
        }
        ModelAndView mav = new ModelAndView("Agent/policyHolderRecordsManage");
        mav.addObject("listPolicyHolderRecords", listPolicyHolderRecords);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin/policyHolderRecordsManage")
    public ModelAndView adminHome() {
        List<PolicyHolderRecords> listPolicyHolderRecords = policyHolderRecordsService.listAll();
        for (PolicyHolderRecords PolicyHolderRecords : listPolicyHolderRecords) {
            System.out.println(PolicyHolderRecords.toString());
        }
        ModelAndView mav = new ModelAndView("Admin/policyHolderRecordsManage");
        mav.addObject("listPolicyHolderRecords", listPolicyHolderRecords);
        return mav;
    }
    // When the path is routed to '/new' below method to be called and view returned is newPokemon
    @RequestMapping(method = RequestMethod.GET, value ="/admin/newPolicyHolderRecords")
    public String newAdminPolicyHolderRecordsForm(Map<String, Object> model) {
        PolicyHolderRecords policyHolderRecords= new PolicyHolderRecords();
        model.put("policyHolderRecords", policyHolderRecords);
        return "Admin/newPolicyHolderRecords";
    }

    @RequestMapping(method = RequestMethod.GET, value ="/agent/newPolicyHolderRecords")
    public String newAgentPolicyHolderRecordsForm(Map<String, Object> model) {
        PolicyHolderRecords policyHolderRecords= new PolicyHolderRecords();
        model.put("policyHolderRecords", policyHolderRecords);
        return "Agent/newPolicyHolderRecords";

    }
    // When a form is submitted in POST and action method as 'save' below method to be called returned to home '/' i.e. index
    @RequestMapping(method = RequestMethod.POST, value = "/admin/savePolicyHolderRecords")
    public String saveAdminPolicyHolderRecords(@ModelAttribute("policyHolderRecords") PolicyHolderRecords policyHolderRecords) {
        policyHolderRecordsService.save(policyHolderRecords);
        return "redirect:/admin/policyHolderRecordsManage";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/agent/savePolicyHolderRecords")
    public String saveAgentPolicyHolderRecords(@ModelAttribute("policyHolderRecords") PolicyHolderRecords policyHolderRecords) {
        policyHolderRecordsService.save(policyHolderRecords);
        return "redirect:/agent/policyHolderRecordsManage";
    }
    // When the path is routed to '/edit' below method to be called and view returned is editPokemon
    @RequestMapping(method = RequestMethod.GET, value = "/agent/editPolicyHolderRecords")
    public ModelAndView editAgentPolicyHolderRecordsForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Agent/editPolicyHolderRecords");
        PolicyHolderRecords policyHolderRecords = policyHolderRecordsService.get(id);
        mav.addObject("policyHolderRecords", policyHolderRecords);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/admin/editPolicyHolderRecords")
    public ModelAndView editAdminPolicyHolderRecordsForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Admin/editPolicyHolderRecords");
        PolicyHolderRecords policyHolderRecords = policyHolderRecordsService.get(id);
        mav.addObject("policyHolderRecords", policyHolderRecords);
        return mav;
    }
    // When the path is routed to '/delete' below method to be called and view returned is pokemanage
    @RequestMapping(method = RequestMethod.GET, value ="/admin/deletePolicyHolderRecords")
    public String deletePolicyHolderRecordsForm(@RequestParam long id) {
        policyHolderRecordsService.delete(id);
        return "redirect:/admin/policyHolderRecordsManage";
    }
    // When the path is routed to '/search' below method to be called and view returned is searchPokemon
    @RequestMapping(method = RequestMethod.GET, value ="/admin/searchPolicyHolderRecords")
    public ModelAndView searchAdmin(@RequestParam Date appliedDate) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(appliedDate);
        ModelAndView mav = new ModelAndView("Admin/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/admin/searchPhrByPolicyNumber")
    public ModelAndView searchAdminByPolicyNumber(@RequestParam String policyNumber) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(policyNumber);
        ModelAndView mav = new ModelAndView("Admin/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/admin/searchPhrByCustomerNumber")
    public ModelAndView searchAdminByCustomerNumber(@RequestParam Long id ) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(id);
        ModelAndView mav = new ModelAndView("Admin/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/agent/searchPolicyHolderRecords")
    public ModelAndView searchAgent(@RequestParam Date appliedDate) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(appliedDate);
        ModelAndView mav = new ModelAndView("Agent/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/agent/searchPhrByPolicyNumber")
    public ModelAndView searchByPolicyNumber(@RequestParam String policyNumber) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(policyNumber);
        ModelAndView mav = new ModelAndView("Agent/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/agent/searchPhrByCustomerNumber")
    public ModelAndView searchByCustomerNumber(@RequestParam Long id ) {
        List<PolicyHolderRecords> result = policyHolderRecordsService.search(id);
        ModelAndView mav = new ModelAndView("Agent/searchPolicyHolderRecords");
        mav.addObject("result", result);
        return mav;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/admin/showPhr")
    public ModelAndView showAdminPhrDetails(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Admin/phrDetails");
        PolicyHolderRecords policyHolderRecords = policyHolderRecordsService.get(id);
        mav.addObject("policyHolderRecords", policyHolderRecords);
        return mav;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/agent/showPhr")
    public ModelAndView showAgentPhrDetails(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("Agent/phrDetails");
        PolicyHolderRecords policyHolderRecords = policyHolderRecordsService.get(id);
        mav.addObject("policyHolderRecords", policyHolderRecords);
        return mav;
    }
}

