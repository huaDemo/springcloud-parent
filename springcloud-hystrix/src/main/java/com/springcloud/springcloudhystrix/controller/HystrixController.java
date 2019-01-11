package com.springcloud.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.springcloudhystrix.remote.RemoteHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hua
 * @date: 2019/1/11 21:12
 */
@RestController
public class HystrixController {

    @Autowired
    private RemoteHystrixService remoteHystrixService;

    @RequestMapping(method = RequestMethod.GET, value = "/get/{str}")
    // 一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod中的指定方法
    @HystrixCommand(fallbackMethod = "get2")
    public String get(@PathVariable("str") String str) throws Exception {
        throw new Exception();
    }

    public String get2(@PathVariable("str") String str) throws Exception {
        return str;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/feign/{str}")
    public String feign(@PathVariable("str") String str) throws Exception {
        return remoteHystrixService.demo(str);
    }

}
