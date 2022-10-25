package com.demo.service;

import com.demo.model.PolicyHolderRecords;
import com.demo.model.PolicyHolderRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
//@Transactional annotation so all of its methods will be intercepted by Spring Data JPA for transaction management
@Transactional
public class PolicyHolderRecordsService {
    //instance of CustomerRepository interface will be injected into this class:
    @Autowired
    PolicyHolderRecordsRepository repo;
    public void save(PolicyHolderRecords policyHolderRecords) {
        repo.save(policyHolderRecords);
    }
    public List<PolicyHolderRecords> listAll() {
        return (List<PolicyHolderRecords>) repo.findAll();
    }
    public PolicyHolderRecords get(Long id) {
        return repo.findById(id).get();
    }
    public void delete(Long id) {
        repo.deleteById(id);
    }
    public List<PolicyHolderRecords> search(Date appliedDate) {
        return repo.findPolicyHolderRecordsByAppliedDate(appliedDate);

    }
    public List<PolicyHolderRecords> search(Long id) {
        return repo.findPolicyHolderRecordsByCustomerId(id);

    }
    public List<PolicyHolderRecords> search(String policyNumber) {
        return repo.findPolicyHolderRecordsByPolicyNumber(policyNumber);

    }
}