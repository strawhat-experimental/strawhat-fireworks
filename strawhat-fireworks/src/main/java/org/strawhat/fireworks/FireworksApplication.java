package org.strawhat.fireworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class FireworksApplication {

    public static void main(String[] args) {
        SpringApplication.run(FireworksApplication.class, args);
    }

}
