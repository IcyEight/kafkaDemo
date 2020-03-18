# Getting Started

To run the application, please install Apache Kafka instance from this [link](https://kafka.apache.org/downloads). Then start up zookeeper, kafka broker, create a topic named MyTopic and spin up producer as follows:

`cd kafka_2.11-2.4.0`

Start zookeeper:
`./bin/zookeeper-server-start.sh config/zookeeper.properties`

Keep zookeeper running and start Kafka broker:
`./bin/kafka-server-start.sh config/server.properties`

Create a topic called MyTopic1:
`./bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic MyTopic1`

Create another topic called MyTopic2
`./bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic MyTopic2`

Create console producer that sends message to MyTopic1:
`./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic MyTopic1`

Create another console producer that sends message to MyTopic2:
`./bin/kafka-console-producer.sh --broker-list localhost:9092 --topic MyTopic2`

Now start the application. Send any string to MyTopic1 and any json formatted string to MyTopic2, you will receive the corresponsing messages on the application side as consumers for the topics.

Helpful commands:
To list topics:
`./bin/kafka-topics.sh --list --bootstrap-server localhost:9092`

To create a console consumer (we don't need this one to run our application though):
`./bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic MyTopic --from-beginning`


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/maven-plugin/)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-kafka)


