package com.jelly.jaicodemothor.service;

import com.jelly.jaicodemothor.model.dto.chathistory.ChatHistoryQueryRequest;
import com.jelly.jaicodemothor.model.entity.User;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.jelly.jaicodemothor.model.entity.ChatHistory;

import java.time.LocalDateTime;

/**
 * 对话历史 服务层。
 *
 * @author jelly
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 保存对话历史记录
     *
     * @param appId       应用id
     * @param message     消息内容
     * @param messageType 消息类型
     * @param userId      用户id
     * @return 是否保存成功
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 根据应用id分页查询对话历史记录
     *
     * @param appId           应用id
     * @param pageSize        每页大小
     * @param lastCreateTime  最后创建时间
     * @param loginUser       登录用户
     * @return 对话历史记录分页结果
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 根据应用id删除对话历史记录
     *
     * @param appId 应用id
     * @return 是否删除成功
     */
    boolean deleteByAppId(Long appId);

    /**
     * 获取查询包装类
     *
     * @param chatHistoryQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);
}
