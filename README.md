/kafka_2.13-3.2.0$ bin/zookeeper-server-start.sh config/zookeeper.properties
/kafka_2.13-3.2.0$ bin/kafka-server-start.sh config/server.properties

bin/kafka-topics.sh --bootstrap-server localhost:9092 --create --replication-factor 1 --partitions 1 --topic <topi-name>

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic <topi-name> --from-beginning