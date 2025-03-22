//
//package com.slzvieira.study.sqsdemo;
//
//import software.amazon.awssdk.http.apache.ApacheHttpClient;
//import software.amazon.awssdk.services.sqs.SqsClient;
//
///**
// * The module containing all dependencies required by the {@link Handler}.
// */
//public class DependencyFactory {
//
//    private DependencyFactory() {}
//
//    /**
//     * @return an instance of SqsClient
//     */
//    public static SqsClient sqsClient() {
//        return SqsClient.builder()
//                       .httpClientBuilder(ApacheHttpClient.builder())
//                       .build();
//    }
//}
