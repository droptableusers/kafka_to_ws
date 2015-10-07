package kafka_to_ws;

import kafka_to_ws.resources.KafkaWsResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import be.tomcools.dropwizard.websocket.WebsocketBundle;

public class Main extends Application<KafkaToWsConfiguration>{

	private WebsocketBundle websocketBundle = new WebsocketBundle();

	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(Bootstrap<KafkaToWsConfiguration> bootstrap) {
		super.initialize(bootstrap);
		bootstrap.addBundle(websocketBundle);
	}
	
	@Override
	public void run(KafkaToWsConfiguration configuration, Environment environment) throws Exception {
		websocketBundle.addEndpoint(KafkaWsResource.class);
	}

}
