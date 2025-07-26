package com.jelly.jaicodemothor.controller;

import com.jelly.jaicodemothor.common.BaseResponse;
import com.jelly.jaicodemothor.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 *
 * @author jelly
 * @date 2025/7/26
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
