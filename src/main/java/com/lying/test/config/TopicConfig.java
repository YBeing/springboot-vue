/**
 * className:TopicConfig
 * author:Lyibing
 * date: 2019/10/18
 */
package com.lying.test.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    @Bean
    public Queue makeBillQueue() {
        return new Queue("bill.makeBill");
    }
    /*交换机——TopicExchange*/
    /*只有通过通配符要求的才能进入消费者,被消费者接收到*/
    @Bean
    public TopicExchange billExchange() {
        return new TopicExchange("coreExchange");
    }
    /*把bill.makeBill的消息队列绑定在交换机上*/
    @Bean
    public Binding bindingCoreExchange(Queue makeBillQueue, TopicExchange billExchange) {
        //routingKey 是*,只能匹配多一层路径 # 可以匹配多层路径
        return BindingBuilder.bind(makeBillQueue).to(billExchange).with("bill.makeBill.*");
    }




}
