package xyz.lsgdut.dhxt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.service.UserService;
import xyz.lsgdut.dhxt.utils.JSONResult;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

        @RequestMapping(value = "/addOneUser")
    @ResponseBody
    public JSONResult addOneUser(@ModelAttribute TbUser tbUser) {
        String msg = userService.addOneUser(tbUser);
        if (msg.contains("成功")){
            return JSONResult.ok(msg);
        }else{
            return JSONResult.errorMsg(msg);
        }
    }

    @RequestMapping(value = "/getAllUsers")
    @ResponseBody
    public JSONResult getAllUsers() {
        List<TbUser> users = userService.getAllUsers();
        if (users.size()!=0){
            return JSONResult.ok(users);
        }else{
            return JSONResult.errorMsg("还没有user");
        }
    }
}
