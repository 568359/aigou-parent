package org.yangxin.aigou.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yangxin.aigou.domain.Employee;
import org.yangxin.aigou.util.AjaxResult;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee) {
        if("admin".equals(employee.getName())&& "admin".equals(employee.getPassword())) {
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或密码不正确！");
    }
}
