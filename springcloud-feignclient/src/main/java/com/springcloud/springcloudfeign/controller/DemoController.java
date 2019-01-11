package com.springcloud.springcloudfeign.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: hua
 * @date: 2019/1/11 20:21
 */
@RestController
public class DemoController {

    @RequestMapping(method = RequestMethod.GET, value = "/demo/{str}")
    public String demo(@PathVariable("str") String str) throws Exception {
        return str;
    }

}
