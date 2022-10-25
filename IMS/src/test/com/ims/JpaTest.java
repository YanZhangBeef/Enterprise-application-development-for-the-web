package com.ims;

import com.demo.config.JPAConfig;
import com.demo.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {JPAConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)

public class JpaTest {
    @Autowired
    private CustomerRepository customerRepo;
    @Autowired
    private PolicyRepository PolicyRepo;
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PolicyHolderRecordsRepository PolicyHolderRepo;

    @Test
    public void testUser(){
        User user = new User();
        user.setUsername("agent");
        String password= "1234";
        user.setPassword(password);
        user.setRole_name("ROLE_AGENT");
        userRepo.save(user);
    }
}
