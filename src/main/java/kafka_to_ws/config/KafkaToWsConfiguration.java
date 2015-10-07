package kafka_to_ws.config;

import lombok.Getter;
import io.dropwizard.Configuration;

@Getter
public class KafkaToWsConfiguration extends Configuration{
	KafkaConsumerConfig kafkaConsumer;
}
