package com.cykj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class HelloControler {


    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }
    // 风味杰
    @ResponseBody
    @PostMapping("/getHello4")
    public  String getHello4(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "1111";
    }
}
