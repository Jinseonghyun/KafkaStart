package jin.kafkastart.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate; // key, value 둘다 string 유형

    public void sendMessage(String msg) {
        log.info(format("Sending message to jin Topic: %s", msg));
        kafkaTemplate.send("jin", msg);
    }
}
