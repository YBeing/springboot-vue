/**
 * className:HelloRabbitConsumer
 * author:Lyibing
 * date: 2019/10/18
 */
package com.lying.test.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * 消费者
 * <p>Title: HelloRabbitProvider</p>
 * <p>Description: </p>
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class HelloRabbitConsumer {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Consumer: " + message);
    }
}
