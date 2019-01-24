package com.arxus.monoceros.base.kit;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 *
 * Author YangXuyue
 * Date 2019/1/24 9:50
 */
public final class StringKit {
    private StringKit() {
    }

    /**
     * 判断字符串是否为空，或全是空格
     *
     * @param cs
     * @return
     * @Author : YangXuyue
     * @Date : 2019/1/24 11:02
     */
    public static boolean isBlank(CharSequence cs) {
        return StringUtils.isBlank(cs);
    }
}
