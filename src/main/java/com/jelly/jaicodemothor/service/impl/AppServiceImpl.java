package com.jelly.jaicodemothor.service.impl;

import com.jelly.jaicodemothor.mapper.AppMapper;
import com.jelly.jaicodemothor.model.entity.App;
import com.jelly.jaicodemothor.service.AppService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author jelly
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService {

}
