package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

     Logger logger= LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/queryAll")
    public List<User> queryAll(HttpServletRequest request) {
        List<User> users = null;
        try {
            users = userService.queryAll();
            logger.info("this method success");
        } catch (Exception e) {
            logger.error("this method failed");
            e.printStackTrace();
        }

        return users;
    }

    @RequestMapping("/save")
    public void save(User user) {
        userService.save(user);
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
