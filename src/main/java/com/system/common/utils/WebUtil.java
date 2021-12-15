package com.system.common.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebUtil {

    public static Object getSessionAttribute(HttpServletRequest req, String key) {
        Object ret = null;

        try {
            ret = req.getSession(false).getAttribute(key);
        } catch (Exception e) {
        }
        return ret;
    }

    public static void response(HttpServletResponse response, String result) {
        try {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void response(HttpServletResponse response, Object result) {
        try {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String packJsonp(String callback, String json) {
        if (json == null) {
            json = "";
        }
        if (callback == null || callback.isEmpty()) {
            return json;
        }

        return callback + "&&" + callback + '(' + json + ')';
    }

    public static String packJsonp(String callback, Object response) {
        String json = null;
        if (response == null) {
            json = "";
        } else {
            json = JSONUtils.beanToJson(response).toString();
        }
        if (callback == null || callback.isEmpty()) {
            return json;
        }

        return callback + "&&" + callback + '(' + json + ')';
    }
}