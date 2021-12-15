package com.system.common.utils;

public class ResultUtil {

    /**
     * 渲染失败数据
     *
     * @return result
     */
    public static JsonResult renderError() {
        JsonResult result = new JsonResult();
        result.setSuccess(false);
        result.setStatus("500");
        return result;
    }

    /**
     * 渲染失败数据（带消息）
     *
     * @param msg 需要返回的消息
     * @return result
     */
    public static JsonResult renderError(String msg) {
        JsonResult result = renderError();
        result.setMsg(msg);
        return result;
    }

    /**
     * 渲染失败数据（带消息和数据）
     *
     * @param msg 需要返回的消息
     * @return result
     */
    public static JsonResult renderError(String msg,Object obj) {
        JsonResult result = renderError();
        result.setMsg(msg);
        result.setObj(obj);
        return result;
    }

    /**
     * 渲染成功数据
     *
     * @return result
     */
    public static JsonResult renderSuccess() {
        JsonResult result = new JsonResult();
        result.setSuccess(true);
        result.setStatus("200");
        return result;
    }

    /**
     * 渲染成功数据（带信息）
     *
     * @param msg 需要返回的信息
     * @return result
     */
    public static JsonResult renderSuccess(String msg) {
        JsonResult result = renderSuccess();
        result.setMsg(msg);
        return result;
    }
    /**
     * 渲染成功数据（带信息和数据）
     *
     * @param msg 需要返回的信息
     * @return result
     */
    public static JsonResult renderSuccess(String msg,Object obj) {
        JsonResult result = renderSuccess();
        result.setMsg(msg);
        result.setObj(obj);
        return result;
    }

    /**
     * 渲染成功数据（带数据）
     *
     * @param obj 需要返回的对象
     * @return result
     */
    public static JsonResult renderSuccess(Object obj) {
        JsonResult result = renderSuccess();
        result.setObj(obj);
        return result;
    }
}
