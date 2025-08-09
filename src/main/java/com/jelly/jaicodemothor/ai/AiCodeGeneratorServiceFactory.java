package com.jelly.jaicodemothor.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代码生成服务工厂
 *
 * @author jelly
 * @date 2025/8/6
 */
@Configuration
public class AiCodeGeneratorServiceFactory {

    @Resource
    ChatModel chatModel;

    @Resource
    StreamingChatModel streamingChatModel;

    @Bean
    public AiCodeGeneratorService aiCodeGeneratorServiceStream() {
        return AiServices.builder(AiCodeGeneratorService.class)
                .chatModel(chatModel)
                .streamingChatModel(streamingChatModel)
                .build();
    }
}
