package com.saurav.springbootPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private static final Logger log = LogManager.getLogger(HomeController.class);

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String portNumber;

    @RequestMapping("/")
    public String index() {
        try {
            String a = null;
            System.out.println("appName " + appName + " is running on port -> "+ portNumber);
            return "index.html";
        } catch (Exception e) {
//            System.out.print(e.getStackTrace());
            log.error("e: ", e);
            return "";
        }
    }
}
