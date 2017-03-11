package com.qijun.login.login.controller;

import com.qijun.login.login.entity.Emp;
import com.qijun.login.login.exception.LoginException;
import com.qijun.login.login.service.EmpService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */

@Controller
@RequestMapping("/loginController")
public class LoginController {
    
    @Autowired
    private EmpService empService;

    private static final Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/login.do")
    public String login(Model model, @ModelAttribute("empFromForm") Emp empFromForm, HttpServletRequest request) throws Exception {
        logger.info("接收到的工号" + empFromForm.getEmpId());
        logger.info("接收到的密码" + empFromForm.getEmpPwd());
        try {
            Emp emp = empService.login(empFromForm);
            request.getSession().setAttribute("emp",emp);
            logger.info("存到session中的emp:" + emp);
            return "index";
        } catch (LoginException e) {
            model.addAttribute("message", e.getMessage());
            logger.info("错误信息:" + e.getMessage());
//            回显数据
            model.addAttribute("empFromForm", empFromForm);
            logger.info("回显的对象:" + empFromForm);
            return "login";
        }

    }



}
