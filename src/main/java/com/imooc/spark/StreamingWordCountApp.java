package com.imooc.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import scala.Tuple2;

import java.util.Arrays;

public class StreamingWordCountApp {

    public static void main(String[] args) throws Exception {

        SparkConf conf = new SparkConf().setMaster("local[2]")
                .setAppName("StreamingWordCountApp");
        JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(5));

        JavaReceiverInputDStream<String> lines = jssc
                .socketTextStream("localhost", 9999);

        JavaPairDStream<String, Integer> counts = lines.flatMap(line ->
                Arrays.asList(line.split("\t")).iterator())
                .mapToPair(word ->
                        new Tuple2<String,Integer>(word, 1))
                .reduceByKey((x,y) -> x+y);

        counts.print();

        jssc.start();
        jssc.awaitTermination();
    }
}
