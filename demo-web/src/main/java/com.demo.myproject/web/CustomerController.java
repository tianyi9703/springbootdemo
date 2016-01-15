package com.demo.myproject.web;

import com.demo.myproject.config.ConfigProperties;
import com.demo.myproject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * Created by tianwen on 16/1/3.
 */
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    ConfigProperties configProperties;
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object getCustomer() {


        return customerService.getCustomer();


    }

    @RequestMapping(value = "/getconfig", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Object getconfig() {


        return configProperties.getApplicationName();


    }
    @RequestMapping("/web")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello");
        System.out.println("after filter");
        return "welcome";
    }
}
