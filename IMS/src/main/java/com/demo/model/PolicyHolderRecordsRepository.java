package com.demo.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface PolicyHolderRecordsRepository extends JpaRepository<PolicyHolderRecords, Long> {

    @Query("From PolicyHolderRecords where customer.id =:id")
    List<PolicyHolderRecords> findPolicyHolderRecordsByCustomerId(@Param("id") Long id);

    @Query("From PolicyHolderRecords where policyNumber.number =:number")
    List<PolicyHolderRecords> findPolicyHolderRecordsByPolicyNumber(@Param("number") String number);

    @Query("From PolicyHolderRecords where appliedDate =:appliedDate")
    List<PolicyHolderRecords> findPolicyHolderRecordsByAppliedDate(@Param("appliedDate") Date appliedDate);
}