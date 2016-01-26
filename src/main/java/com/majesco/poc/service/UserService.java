package com.majesco.poc.service;

import com.majesco.poc.model.Address;
import com.majesco.poc.model.User;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Biplab Nayak
 */

@Component
public class UserService {

    private static Map<String, User> userMap;

    static {
        userMap = new ConcurrentHashMap<>();

        User biplab = new User();
        biplab.setUserId("biplab");
        biplab.setFirstName("Biplab");
        biplab.setLastName("Nayak");
        biplab.setMiddleName("Prasad");
        biplab.setDob("16-09-1990");
        biplab.setEmail("prasad_biplab@yahoo.com");
        biplab.setPhone("9819648869");
        biplab.setCurrentAddress(new Address("204", "A1", "Street1", "123456"));
        biplab.setPermanentAddress(new Address("204", "A1", "Street1", "123456"));

        userMap.put(biplab.getUserId(), biplab);
    }

    public User getUser(String userId) {
        return userMap.get(userId);
    }
}
