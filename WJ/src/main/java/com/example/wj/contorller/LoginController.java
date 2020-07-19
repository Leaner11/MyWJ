package com.example.wj.contorller;

import com.example.wj.entity.User;
import com.example.wj.result.Result;
import com.example.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by Enzo Cotter on 2020/6/25.
 */

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User user= userService.get(username,requestUser.getPassword());
        if (null==user){
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
