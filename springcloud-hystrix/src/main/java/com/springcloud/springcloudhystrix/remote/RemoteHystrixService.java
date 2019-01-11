package com.springcloud.springcloudhystrix.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: hua
 * @date: 2019/1/11 21:22
 */
@FeignClient(name = "number", fallbackFactory = RemoteHystrixService.RemoteHystrixServiceImpl.class)
public interface RemoteHystrixService {

    @RequestMapping(method = RequestMethod.GET, value = "/demo/{str}")
    String demo(@PathVariable("str") String str) throws Exception;

    @Service
    class RemoteHystrixServiceImpl implements RemoteHystrixService {

        @Override
        public String demo(String str) throws Exception {
            return "进入熔断";
        }
    }

}
