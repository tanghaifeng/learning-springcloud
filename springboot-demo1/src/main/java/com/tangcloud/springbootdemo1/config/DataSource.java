//package com.tangcloud.springbootdemo1.config;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import java.lang.management.PlatformManagedObject;
//
//
//@Component
//@Configuration
//public class DataSource {
//
//    @Bean
//    @ConfigurationProperties("foo.datasource")
//    public DataSourceProperties fooDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
////    public PlatformTransactionManager fooTx() {
////        return new DataSourceTransactionManager("")
////    }
//
//    @Bean
//    @ConfigurationProperties("bar.datasource")
//    public DataSourceProperties barDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//}
