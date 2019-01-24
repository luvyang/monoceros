package com.arxus.monoceros.base.entity;

import java.util.HashMap;

/**
 * Response基础实体
 *
 * @Author : YangXuyue
 * @Date : 2019/1/24 10:03
 */
public class BaseResult<T> extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;
    /**
     * 成功标识
     */
    public static final Integer SUCCESS_CODE = 0;
    /**
     * 失败标识
     */
    public static final Integer FAILURE_CODE = -1;

    /**
     * 默认成功
     */
    public BaseResult() {
        put("code", SUCCESS_CODE);
        put("msg", "success");
    }

    /**
     * 默认成功code 为1
     *
     * @return
     */
    public static BaseResult ok() {
        return new BaseResult();
    }

    /**
     * code为1，自定义message
     *
     * @param msg
     * @return
     */
    public static BaseResult ok(String msg) {
        BaseResult r = new BaseResult();
        r.put("msg", msg);
        return r;
    }

    /**
     * 置入数据data
     *
     * @param data
     * @return
     */
    public static <T> BaseResult ok(T data) {
        return new BaseResult().put("data", data);
    }

    /**
     * 默认服务器错误
     *
     * @return
     */
    public static BaseResult error() {
        return error("未知异常，请联系管理员");
    }

    /**
     * 错误+自定义message
     *
     * @param msg
     * @return
     */
    public static BaseResult error(String msg) {
        BaseResult r = new BaseResult();
        r.put("code", FAILURE_CODE);
        r.put("msg", msg);
        return r;
    }

    /**
     * 存储键值对，自定义返回数据模型
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public BaseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
