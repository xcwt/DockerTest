package com.xc.mail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class HelloController {

   // private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/hello")
    public String hello(@RequestBody User user){
       // logger.debug("日志开始打印");
        logger.info("日志开始");
        logger.info("user:{}", user);
        return "Hello Docker";
    }
}
