package com.blogoid.qtodbservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.blogoid.qtodbservice.model.Blog;

@Service
public class QueueConsumer {
	
	@RabbitListener(queues = "q.hello")
    @RabbitHandler
    public void receive(Blog in) {
        System.out.println(" [x] Received '" + in + "'");
    }
}
