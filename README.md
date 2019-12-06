# Real-time data stream processing

# Problem description
Nowadays web companies are collecting large amount of data from different sources in short time. It becomes more and more challenging and important to store and maintain large data-sets in a highly distributed system, process a complex query efficiently on the large data set as required for data analysis and accomplish real time big data streaming fast. 

# Method
To meet all requirements about big data processing, many useful and powerful big data softwares and tools are devevloped and open-sourced by famous companies so that we can use them to meet most basic requirements. Currently, Apache Hadoop is still a powerful tool to maintain a highly distributed file system (HDFS) with Yarn to control resource management and job scheduling. Many other open-source software are built on top of Hadoop. For exmaple, Apache Spark is a cluster-computing framework which is compatible with Hadoop data through Yarn and it dramatically improves the performance of Map-Reduce. Also, Spark Streaming is a powerful tool to process data streaming.

# Process
![](process.png)

# Expected results
With so many powerful open-source big data tools, framework and software available, I plan to do website activiy log processing system using Hadoop, Spark, Kafka and so on so that the system can finish off-line query and process data streaming efficienty. That is my initial plan for my CSCI 653 project. I may add more contents with the development of this project.


## Flume, Kafka and Spark Streaming
Apache Flume: A distributed, reliable, and available service for efficiently collecting, aggregating, and moving large amounts of log data. It has a simple and flexible architecture based on streaming data flows. It is robust and fault tolerant with tunable reliability mechanisms and many failover and recovery mechanisms. It uses a simple extensible data model that allows for online analytic application.[1]

Apache Kafka: Publish and subscribe to streams of records, similar to a message queue or enterprise messaging system.[2]

Spark Streaming: an extension of the core Spark API that enables scalable, high-throughput, fault-tolerant stream processing of live data streams. Data can be ingested from many sources like Kafka, Flume, Kinesis, or TCP sockets, and can be processed using complex algorithms expressed with high-level functions like map, reduce, join and window. Finally, processed data can be pushed out to filesystems, databases, and live dashboards. In fact, you can apply Spark’s machine learning and graph processing algorithms on data streams.[3]

# Reference
[1] https://flume.apache.org;
[2] https://kafka.apache.org/intro;
[3] https://spark.apache.org/docs/latest/streaming-programming-guide.html#overview;
