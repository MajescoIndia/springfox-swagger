package com.majesco.poc.controller;

import com.majesco.poc.model.clue.ClueRequest;
import com.majesco.poc.model.clue.ClueResponse;
import com.majesco.poc.model.mvr.MvrRequest;
import com.majesco.poc.model.mvr.MvrResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Biplab Nayak
 */
@RestController
@RequestMapping("/driverInfo")
@Api(value = "DriverDetails", description = "DriverDetails Description")
public class DriverInformationController {

    @RequestMapping(value = "/mvrDetails", method = RequestMethod.POST)
    public MvrResponse getMvrDetails(@RequestBody MvrRequest request) {
        return null;
    }

    @RequestMapping(value = "/clueDetails", method = RequestMethod.POST)
    public ClueResponse getClueDetails(ClueRequest request){
        return null;
    }
}
