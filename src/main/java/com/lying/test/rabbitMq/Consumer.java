/**
 * className:MqProviderUtil
 * author:Lyibing
 * date: 2019/11/19
 */
package com.lying.test.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
/*消费者*/

public class Consumer {
    @RabbitListener(queues = "bill.makeBill")
    @RabbitHandler
    public void makebill2(String msg){
        System.out.println("成功了");
    }

}
