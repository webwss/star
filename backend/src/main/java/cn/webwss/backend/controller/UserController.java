package cn.webwss.backend.controller;

import cn.webwss.backend.common.BaseResponse;
import cn.webwss.backend.common.ResultUtils;
import cn.webwss.backend.constant.UserConstant;
import cn.webwss.backend.model.entity.User;
import cn.webwss.backend.service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/login")
    public BaseResponse<User> login(long userId, HttpServletRequest request) {
        User user = userService.getById(userId);
        request.getSession().setAttribute(UserConstant.LOGIN_USER, user);
        return ResultUtils.success(user);
    }


    @GetMapping("/get/login")
    public BaseResponse<User> getLoginUser(HttpServletRequest request) {
        User loginUser = (User) request.getSession().getAttribute(UserConstant.LOGIN_USER);
        return ResultUtils.success(loginUser);
    }


}
