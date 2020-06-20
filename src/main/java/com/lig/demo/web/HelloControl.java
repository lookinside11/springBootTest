package com.lig.demo.web;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloControl {
    //
      @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String  hello(String name)
    {
        return  "Hello 世界"+name;
    }

}
