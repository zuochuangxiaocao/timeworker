package com.time.common.core.redis;

import com.time.common.core.constant.Constants;
import com.time.common.core.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 缓存操作类
 */
@Component
public class CacheRedis {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    /**
     *
     * 单位分钟
     */
    public <T> T set(Object key, T t) {
        if (t != null) {
            redisTemplate.opsForValue().set(key, JSONUtil.toJSONString(t), Constants.MINUTE, TimeUnit.MINUTES);
        }
        return t;
    }

    /**
     * 单位分钟
     */
    public <T> T set(Object key, T t, Integer time) {
        if (t != null) {
            redisTemplate.opsForValue().set(key, JSONUtil.toJSONString(t), time, TimeUnit.MINUTES);
        }
        return t;
    }

    public <T> T get(Object key, Class<T> clazz) {
        if (redisTemplate.hasKey(key)) {
            return JSONUtil.parseObject(redisTemplate.opsForValue().get(key).toString(), clazz);
        }
        return null;
    }

    public void delete(Object key) {
        if (redisTemplate.hasKey(key)) {
            redisTemplate.delete(key);
        }
    }

}
