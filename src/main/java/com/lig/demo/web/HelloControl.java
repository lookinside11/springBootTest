package com.lig.demo.web;

import com.lig.demo.impl.UserImpl;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloControl {
    @RequestMapping("/hello")
      public String getUser() {
          UserImpl user=new UserImpl();
          user.setName("⼩小明");
          user.setAddress("海淀区");
          return "jkjk1";
      }



}
