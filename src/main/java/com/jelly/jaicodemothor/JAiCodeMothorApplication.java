package com.jelly.jaicodemothor;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.jelly.jaicodemothor.mapper")
public class JAiCodeMothorApplication {

    public static void main(String[] args) {
        SpringApplication.run(JAiCodeMothorApplication.class, args);
    }

}
