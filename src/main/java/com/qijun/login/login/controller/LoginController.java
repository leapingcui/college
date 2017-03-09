package com.qijun.login.login.controller;

import com.qijun.login.login.entity.Emp;
import com.qijun.login.login.service.EmpService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String login(Model model, String empId, String empPwd, HttpServletRequest request) {
        logger.info("接收到的工号" + empId);
        logger.info("接收到的密码" + empPwd);
        List<Emp> emps = empService.selectAll();
        for (Emp emp : emps) {
            if (emp.getEmpId().equals(empId) && emp.getEmpPwd().equals(empPwd)) {
                HttpSession session = request.getSession();
                session.setAttribute("empId",empId);
                return "index";
            }
        }
        model.addAttribute("errors", "用户名或密码错误");
        model.addAttribute("empId", empId);
        model.addAttribute("empPwd", empPwd);
        return "login";
    }



}
