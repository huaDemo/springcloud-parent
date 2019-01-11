package com.springcloud.springcloudfeign.controller;

import com.springcloud.springcloudfeign.remote.RemoteDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hua
 * @date: 2019/1/11 20:34
 */
@RestController
public class FeignController {

    @Autowired
    private RemoteDemoService remoteDemoService;

    @RequestMapping(method = RequestMethod.GET, value = "/feign/{str}")
    public String feign(@PathVariable("str") String str) throws Exception {
        return remoteDemoService.demo(str);
    }

}
