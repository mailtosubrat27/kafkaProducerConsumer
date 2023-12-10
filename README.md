# kafkaProducerConsumer
Kafka producer and consumer example

# Download kafka and extract zip file-
	C:\softwares\kafka_2.13-3.6.0\kafka_2.13-3.6.0\config
# Start Zookeeper-
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start Broker-
.\bin\windows\kafka-server-start.bat .\config\server.properties


# Create topic-
.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic testTopic

# Consumer -
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic testTopic --from-beginning

# producrer	
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic testTopic


# Topic list- 
.\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

# Show GroupId-
.\bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --list testTopic

# Steps to start Kafka
1- start zookeeper server
2- Start Broker server
3- Create topic
4- Start consumer server
5- Start Producer server
