package com.majesco.poc.controller;

import com.majesco.poc.model.User;
import com.majesco.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Biplab Nayak
 */

@Controller("/user")
public class UserController {

    @Autowired UserService userService;

    @RequestMapping(path = "/{userId}",method = RequestMethod.GET)
    public User getUser(@PathVariable("userId")String userId) {
        return userService.getUser(userId);
    }
}
