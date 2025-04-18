package cn.webwss.backend.service;


import cn.webwss.backend.model.entity.Blog;
import cn.webwss.backend.model.vo.BlogVO;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public interface BlogService extends IService<Blog> {


    BlogVO getBlogVOById(long blogId, HttpServletRequest request);


    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);

}
