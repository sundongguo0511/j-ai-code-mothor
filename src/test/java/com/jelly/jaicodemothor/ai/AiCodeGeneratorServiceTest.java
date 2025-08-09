package com.jelly.jaicodemothor.ai;

import com.jelly.jaicodemothor.ai.model.HtmlCodeResult;
import com.jelly.jaicodemothor.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * j-ai-code-mothor
 *
 * @author jelly
 * @date 2025/8/6
 */
@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Resource
    AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("做个程序员鱼皮的工作记录小工具，代码少于 30 行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("做个程序员鱼皮的工作记录小工具，代码少于 30 行");
        Assertions.assertNotNull(result);
    }
}