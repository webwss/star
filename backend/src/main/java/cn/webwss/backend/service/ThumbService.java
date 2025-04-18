package cn.webwss.backend.service;


import cn.webwss.backend.model.dto.thnmb.DoThumbRequest;
import cn.webwss.backend.model.entity.Thumb;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @author pine
 */
public interface ThumbService extends IService<Thumb> {

    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);

    /**
     * 取消点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);


    Boolean hasThumb(Long blogId, Long userId);


}
