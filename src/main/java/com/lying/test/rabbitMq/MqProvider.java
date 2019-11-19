/**
 * className:MqProviderUtil
 * author:Lyibing
 * date: 2019/11/19
 */
package com.lying.test.rabbitMq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*生产者*/
@Component
public class MqProvider {
    @Autowired
    private AmqpTemplate rabbitMqTemplate;
    public void makeBill( String topicExchangename, String queuename,String msg){
        rabbitMqTemplate.convertAndSend(topicExchangename,queuename,msg);
        System.out.println(msg);

    }


}
