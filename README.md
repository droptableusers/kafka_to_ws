# kafka_to_ws
A simple app for demonstration purposes, that pushes events over websocket when they are received from kafka.

## Prerequisities
- gradle build tool >= 2.6 http://gradle.org/
- access to a kafka cluster

## Clone, build and start the API
In a work directory do the steps below

```bash
git clone https://github.com/droptableusers/kafka_to_ws.git
cd kafka_to_ws/
gradle clean build shadowJar
```

The config file comes with sane defaults, but you may need to change it to reflect local configuration.
(e.g. change the address of the kafka server(s) and topic name to be used, ports, etc.)
```
vim src/main/resources/config.yaml
```

Finally, start the API
```bash
java -jar build/libs/kafka_to_ws-1.0-all.jar server src/main/resources/config.yaml
```

