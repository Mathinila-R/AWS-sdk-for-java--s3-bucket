package com.springboot.demo;

import com.amazonaws.services.identitymanagement.AmazonIdentityManagement;
import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.identitymanagement.model.ListUsersRequest;
import com.amazonaws.services.identitymanagement.model.ListUsersResult;
import com.amazonaws.services.identitymanagement.model.User;
public class Application {



   public static void main(String[] args) {
      
    
        //Creating amazon s3 client
//        final AmazonS3 s3 = AmazonS3ClientBuilder.standard() .build();
        //Listing all the buckets
//        List<Bucket> buckets = s3.listBuckets();



       //Iterating through the bucket
//        buckets.stream().forEach(bucket -> {
//        System.out.println("Bucket Name : " + bucket.getName() + ", "
//                +"\nBucket Owner : " +bucket.getOwner() .getDisplayName ()
//        +",\nBucket CreationDate : " + bucket.getCreationDate());
//


        final AmazonIdentityManagement iam =
            AmazonIdentityManagementClientBuilder.defaultClient();

        boolean done = false;
        ListUsersRequest request = new ListUsersRequest();

        while(!done) {
            ListUsersResult response = iam.listUsers(request);

            for(User user : response.getUsers()) {
                System.out.format("Retrieved user %s", user.getUserName());
            }

            request.setMarker(response.getMarker());

            if(!response.getIsTruncated()) {
                done = true;
            }
        }}}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   


