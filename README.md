# Query and stream processing for web user activity log

This is my initial idea about how to develop my CSCI 653 project. Some changes may be made with the development of this project in this semester.

# Problem description
Nowadays web companies are collecting large amount of data from different sources in short time. It becomes more and more challenging and important to store and maintain large data-sets in a highly distributed system, process a complex query efficiently on the large data set as required for data analysis and accomplish real time big data streaming fast. 

# Method
To meet all requirements about big data processing, many useful and powerful big data softwares and tools are devevloped and open-sourced by famous companies so that we can use them to meet most basic requirements. Currently, Apache Hadoop is still a powerful tool to maintain a highly distributed file system (HDFS) with Yarn to control resource management and job scheduling. Many other open-source software are built on top of Hadoop. For exmaple, Apache Spark is a cluster-computing framework which is compatible with Hadoop data through Yarn and it dramatically improves the performance of Map-Reduce. Also, Spark Streaming is a powerful tool to process data streaming.

# Expected results
With so many powerful open-source big data tools, framework and software available, I plan to do website activiy log processing system using Hadoop, Spark, Kafka and so on so that the system can finish off-line query and process data streaming efficienty. That is my initial plan for my CSCI 653 project. I may add more contents with the development of this project.

![][pic/Process.png]
