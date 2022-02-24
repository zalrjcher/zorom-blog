package com.zorom.core.service.impl;

import com.zorom.core.entity.ZrmUserInfo;
import com.zorom.core.mapper.ZrmUserInfoMapper;
import com.zorom.core.service.IZrmUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author zalrjcher
 * @since 2022-02-24
 */
@Service
public class ZrmUserInfoServiceImpl extends ServiceImpl<ZrmUserInfoMapper, ZrmUserInfo> implements IZrmUserInfoService {

}
