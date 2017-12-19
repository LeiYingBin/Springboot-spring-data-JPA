package com.lyb.web;


import com.lyb.domain.User;
import com.lyb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String ToLogin(ModelMap map){
        map.addAttribute("user",new User());
        map.addAttribute("action", "create");
        return "homepage";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String Login(@ModelAttribute(value = "user") User user, ModelMap map){
        if(user.getUserid()==null)
            System.out.println("id is null");
        else{
            String pwd = userService.findPwdById(user.getUserid());
        if(user.getPassword().equals(pwd))
            return "homepage";
        else
            map.addAttribute("message","failure");
//            System.out.println("password or id is error");
        return "index";
        }
        return "index";
    }

    @RequestMapping(value = "/logout")
    public String Logout(){
        return "test";
    }
}
