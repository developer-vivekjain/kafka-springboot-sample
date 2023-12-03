# kafka-springboot-sample
This application will connect with the kafka and produce and consume messages.

# With the help of below command just run the zookeeper and kafka in your machine.

docker run -p 2181:2181 zookeeper
docker run -p 9092:9092 -e KAFKA_ZOOKEEPER_CONNECT=<YOUR MACHINE IP>:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://<YOUR MACHINE IP>:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 confluentinc/cp-kafka

