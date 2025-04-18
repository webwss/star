package cn.webwss.backend.service.impl;

import cn.webwss.backend.constant.UserConstant;
import cn.webwss.backend.mapper.UserMapper;
import cn.webwss.backend.model.entity.User;
import cn.webwss.backend.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {


    @Override
    public User getLoginUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(UserConstant.LOGIN_USER);
    }

}




