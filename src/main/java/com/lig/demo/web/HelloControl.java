package com.lig.demo.web;

import com.lig.demo.impl.UserImpl;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.junit.Test;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

@RestController
public class HelloControl {
    @RequestMapping("/hello")
      public String getUser(String name) {
          JdbcTemplate jt=new JdbcTemplate();
        MysqlDataSource ds=new MysqlDataSource( );
        ds.setURL("jdbc:mysql://localhost:3306?test");
        ds.setUser("root");
        ds.setPassword("123");

          UserImpl user=new UserImpl();
          user.setName("⼩小明");
          user.setAddress("海淀区");
          return "jack1"+name;
      }



}
