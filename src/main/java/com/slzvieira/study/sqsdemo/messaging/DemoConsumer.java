package com.slzvieira.study.sqsdemo.messaging;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer {

    @SqsListener("demo-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
