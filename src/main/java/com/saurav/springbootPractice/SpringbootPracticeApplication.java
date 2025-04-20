package com.saurav.springbootPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringbootPracticeApplication {

    private static final Logger log = LogManager.getLogger(SpringbootPracticeApplication.class);

    public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootPracticeApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        System.out.println(Thread.currentThread().getId());
        // fucking with the existing setup
//        var paypalOrderService = new OrderService(new StripePaymentService());
//        paypalOrderService.placeOrder();

    }

}
