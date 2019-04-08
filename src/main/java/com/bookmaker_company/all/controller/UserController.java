package com.bookmaker_company.all.controller;

import com.bookmaker_company.all.model.User;
import com.bookmaker_company.all.service.UserService;
import com.bookmaker_company.all.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public UserController() {
        this.userService = new UserServiceImpl();
    }

    @RequestMapping(value = "/")
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String showUsers(Model m) throws SQLException {
        List<User> users = userService.getAll();
//        if(users == null) throw new UserNotFound();
        m.addAttribute("users_list", users);
        return "users";
    }
}
