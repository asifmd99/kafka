package com.asif.springboot_kafka.kafka;

import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.logging.Logger;

public class KafkaProducer {

     private KafkaTemplate<String,String>  kafkaTemplate;
   private  static  final Logger logger= (Logger) LoggerFactory.getLogger(KafkaProducer.class);
    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public  void sendMessage(String message){
        kafkaTemplate.send("javaguides", "message");
    }


}
