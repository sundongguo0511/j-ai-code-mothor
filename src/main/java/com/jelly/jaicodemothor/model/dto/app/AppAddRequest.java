package com.jelly.jaicodemothor.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建应用
 */
@Data
public class AppAddRequest implements Serializable {

    /**
     * 应用初始化的 prompt
     */
    private String initPrompt;

    private static final long serialVersionUID = 1L;
}
