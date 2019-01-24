package com.arxus.monoceros.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 系统访问 Filter
 *
 * @Author : YangXuyue
 * @Date : 2019/1/24 10:16
 */
@Component("accessFilter")
public class AccessFilter extends ZuulFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * 过滤器的类型，它决定过滤器在请求的哪个生命周期中执行。
     * 这里定义为pre，代表会在请求被路由之前执行
     *
     * @return
     * @Author : YangXuyue
     * @Date : 2019/1/24 10:16
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 过滤器的执行顺序。当请求在一个阶段中存在多个过滤器时，需要根据该方法返回的值来依次执行
     *
     * @return
     * @Author : YangXuyue
     * @Date : 2019/1/24 10:16
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 判断该过滤器是否需要被执行
     *
     * @return
     * @Author : YangXuyue
     * @Date : 2019/1/24 10:16
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     * 实现在请求被路由之前检查HttpServletRequest中是否有accessToken参数
     * 若有就进行路由，若没有就拒绝访问，返回401 Unauthorized错误。
     *
     * @return
     * @throws ZuulException
     * @Author : YangXuyue
     * @Date : 2019/1/24 10:16
     */
    @Override
    public Object run() throws ZuulException {
        return null;
        /*
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        LOGGER.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        Object accessToken = request.getParameter("accessToken");
        if (accessToken == null) {
            LOGGER.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            // 未授权
            ctx.setResponseStatusCode(401);
            return null;
        }
        LOGGER.info("access token ok");
        return null;
        */
    }
}
