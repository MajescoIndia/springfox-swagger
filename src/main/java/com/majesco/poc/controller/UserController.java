package com.majesco.poc.controller;

import com.majesco.poc.model.User;
import com.majesco.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Biplab Nayak
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    User getUser() {
        return userService.getUser("biplab");
        //return "dsfbsghdvfgdvsgfvg";
    }
}
