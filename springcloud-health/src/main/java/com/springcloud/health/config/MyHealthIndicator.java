package com.springcloud.health.config;

import com.springcloud.health.controller.MyRestController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;

/**
 * 自定义健康指示器
 *
 * @author: hua
 * @create: 2018-08-29 17:50
 */
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if (MyRestController.isDB) {
            return new Health.Builder(Status.UP).build();
        } else {
            return new Health.Builder(Status.DOWN).build();
        }
    }
}
