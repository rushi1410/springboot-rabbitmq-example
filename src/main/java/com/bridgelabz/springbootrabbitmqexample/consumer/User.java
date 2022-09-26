package com.bridgelabz.springbootrabbitmqexample.consumer;

import com.bridgelabz.springbootrabbitmqexample.config.MessagingConfig;
import com.bridgelabz.springbootrabbitmqexample.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}

