package com.springcloud.springcloudfeign.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: hua
 * @date: 2019/1/11 20:27
 */
@FeignClient(name = "feignclient")
public interface RemoteDemoService {

    @RequestMapping(method = RequestMethod.GET, value = "/demo/{str}")
    String demo(@PathVariable("str") String str) throws Exception;

}
