package com.time.common.core.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON常用类
 */
public class JSONUtil {

    private JSONUtil() {
    }

    private static final ObjectMapper m = new ObjectMapper();

    /**
     * object 转换成 string
     * @param o
     * @return
     */
    public static String toJSONString(Object o) {
        try {
            m.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            return m.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

    /**
     *  转换为 object
     * @param jsonString 字符串
     * @param elementClasses 目标对象
     * @param <T>
     * @return
     */
    public static <T> T parseObject(String jsonString, Class<T> elementClasses) {
        m.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            return m.readValue(jsonString, elementClasses);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * 转换成 Array
     * @param jsonString
     * @param elementClasses
     * @param <T>
     * @return
     */
    public static <T> List<T> parseArray(String jsonString, Class<T> elementClasses) {
        m.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        JavaType javaType = m.getTypeFactory().constructParametricType(ArrayList.class, elementClasses);
        try {
            return m.readValue(jsonString, javaType);
        } catch (IOException e) {
            return null;
        }
    }

}
