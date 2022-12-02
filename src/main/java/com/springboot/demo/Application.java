package com.springboot.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
@SpringBootApplication
public class Application {



   public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    
        //Creating amazon s3 client
        final AmazonS3 s3 = AmazonS3ClientBuilder.standard() .build();
        //Listing all the buckets
        List<Bucket> buckets = s3.listBuckets();



       //Iterating through the bucket
        buckets.stream().forEach(bucket -> {
        System.out.println("Bucket Name : " + bucket.getName() + ", "
                +"\nBucket Owner : " +bucket.getOwner() .getDisplayName ()
        +",\nBucket CreationDate : " + bucket.getCreationDate());



       });
    }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   


}