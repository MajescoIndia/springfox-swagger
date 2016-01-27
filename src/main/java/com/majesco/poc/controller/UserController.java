package com.majesco.poc.controller;

import com.majesco.poc.model.User;
import com.majesco.poc.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Biplab Nayak
 */

/*@RestController
@RequestMapping("/user")
@Api(value = "vinDecode", description = "VIN Decodeer")*/
public class UserController {

    @Autowired UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/getUser/{userId}")
    public @ResponseBody User getUser(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }
}
