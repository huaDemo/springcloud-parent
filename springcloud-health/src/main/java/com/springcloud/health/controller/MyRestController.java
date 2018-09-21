package com.springcloud.health.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康模拟
 *
 * @author: hua
 * @create: 2018-08-29 17:50
 */
@RestController
public class MyRestController {

    public static boolean isDB = true;

    @GetMapping(value = "/setIsDB/{isDB}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void setIsDB(@PathVariable boolean isDB) {
        this.isDB = isDB;
    }

}
