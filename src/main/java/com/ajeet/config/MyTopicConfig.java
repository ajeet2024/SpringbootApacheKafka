package com.ajeet.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MyTopicConfig {

    @Bean
    public NewTopic myTopic() {
        return  new NewTopic("mytopic", 2, (short) 1);
    }
}
