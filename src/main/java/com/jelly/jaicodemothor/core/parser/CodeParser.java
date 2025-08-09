package com.jelly.jaicodemothor.core.parser;

/**
 * 代码解析器策略接口
 *
 * @author jelly
 * @date 2025/8/8
 */
public interface CodeParser<T> {

    /**
     * 解析代码内容
     *
     * @param codeContent 代码内容
     * @return 解析后的结果对象
     */
    T parseCode(String codeContent);
}
