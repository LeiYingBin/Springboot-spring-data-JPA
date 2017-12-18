package com.lyb.web;

import com.lyb.domain.User;
import com.lyb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public String  getUserById(ModelMap map){
       map.addAttribute("user",userService.findById("12345"));
        return "test";
    }

}
