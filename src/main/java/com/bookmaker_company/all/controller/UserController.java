package com.bookmaker_company.all.controller;

import com.bookmaker_company.all.dao.UserDAOImpl;
import com.bookmaker_company.all.model.User;
import com.bookmaker_company.all.service.UserService;
import com.bookmaker_company.all.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.sql.SQLException;
import java.util.List;


@Controller
public class UserController {
   private UserService userService;

    public UserController() {
       this.userService = new UserServiceImpl();
    }

    @RequestMapping(value = "/")
    public String welcome() {
        return "index";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String showUsers(Model m) throws SQLException {
        List users = userService.getAll();
//        if(users == null) throw new UserNotFound();
        m.addAttribute("users_list", users);
        return "users";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user, Model model) {
        String page = "error";
        model.addAttribute("userName", user);
        boolean result = userService.authentication(user.getUserName());
        if(result) page = "user";
        return page;
    }
}
