package com.arxus.monoceros.gateway.web.server;

import com.arxus.monoceros.base.entity.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Server Controller
 *
 * @Author : YangXuyue
 * @Date : 2019/1/24 10:01
 */
@RestController
@RequestMapping("/server")
public class ServerController {

    /**
     * 配置服务健康检查地址，供Consul调用，需要和配置文件中保持一致
     *
     * @return
     * @Author : YangXuyue
     * @Date : 2019/1/24 10:02
     */
    @GetMapping("/consul/health")
    public BaseResult healthCheck() {
        return BaseResult.ok();
    }

}
