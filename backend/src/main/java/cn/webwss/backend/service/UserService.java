package cn.webwss.backend.service;


import cn.webwss.backend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;


public interface UserService extends IService<User> {


    User getLoginUser(HttpServletRequest request);

}
