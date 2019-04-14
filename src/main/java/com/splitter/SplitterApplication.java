package com.splitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.splitter")
@EnableJpaRepositories(basePackages = "com.splitter")
@EnableConfigurationProperties
@PropertySource("classpath:application.properties")
@EnableSwagger2
@EnableTransactionManagement
//@Import({AmqpConfig.class, TaskExecutorConfig.class, RedisConfig.class})
public class SplitterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SplitterApplication.class, args);
    }
}
