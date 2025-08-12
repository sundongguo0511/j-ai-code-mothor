package com.jelly.jaicodemothor.service;

import com.jelly.jaicodemothor.model.dto.app.AppQueryRequest;
import com.jelly.jaicodemothor.model.entity.App;
import com.jelly.jaicodemothor.model.entity.User;
import com.jelly.jaicodemothor.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author jelly
 */
public interface AppService extends IService<App> {

    /**
     * 通过对话生成应用
     *
     * @param appId     应用id
     * @param message   提示词
     * @param loginUser 登录用户
     * @return 响应流
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 部署应用
     * @param appId 应用id
     * @param loginUser 登录用户
     * @return 部署路径
     */
    String deployApp(Long appId, User loginUser);

    /**
     * 应用数据脱敏
     * @param app 应用信息
     * @return 脱敏后的应用信息
     */
    AppVO getAppVO(App app);
    /**
     * 应用列表数据脱敏
     * @param appList 应用列表
     * @return 脱敏后的应用列表
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 跟据应用查询请求参数 构建 数据查询 wrapper
     * @param appQueryRequest 应用查询请求参数
     * @return 数据查询 wrapper
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

}
