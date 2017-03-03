package com.qijun.teachmanage.choosecourse.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/1.
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/login.do")
    public String login(Model model, String stuId, String stuName){
        logger.info("接收到的学号"+stuId);
        logger.info("接收到的姓名"+stuName);
        if (stuId.equals("111") && stuName.equals("aaa")){
            return "redirect:/studentController/showAllStudents.do";
        }else{
            model.addAttribute("errors","用户名或密码错误");
            model.addAttribute("stuId",stuId);
            model.addAttribute("stuName",stuName);

            return "login";
        }

    }

}
