package jin.kafkastart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class NewTopic {

    @Bean
    public org.apache.kafka.clients.admin.NewTopic newTopic() {
        return TopicBuilder
                .name("jin")
                .build();
    }
}
