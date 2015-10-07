package kafka_to_ws;

import java.util.function.Consumer;

public interface PubSub {
	void register(Object key, Consumer<String> action);
	void unregister(Object key);
	void publish(String message);
}
