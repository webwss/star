package cn.webwss.backend.utils;


import cn.webwss.backend.constant.ThumbConstant;

/**
 * @author pine
 */
public class RedisKeyUtil {

    public static String getUserThumbKey(Long userId) {
        return ThumbConstant.USER_THUMB_KEY_PREFIX + userId;
    }



}
