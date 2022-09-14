package com.gxshen.latte.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gxshen.latte.DTO.SysLoginLogDTO;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gxshen
 * @since 2022-08-25
 */
public interface ISysLoginLogService extends IService<SysLoginLogDTO> {

    IPage<SysLoginLogDTO> querySysLoginLogByPage(Map<String, Object> params);
}
