package com.gxshen.latte.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gxshen.latte.DTO.SysLoginLogDTO;
import com.gxshen.latte.repository.SysLoginLogMapper;
import com.gxshen.latte.service.ISysLoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gxshen
 * @since 2022-08-25
 */
@Service
public class SysLoginLogServiceImpl extends ServiceImpl<SysLoginLogMapper, SysLoginLogDTO> implements ISysLoginLogService {

    @Resource
    private SysLoginLogMapper sysLoginLogMapper;
    @Override
    public IPage<SysLoginLogDTO> querySysLoginLogByPage(Map<String, Object> params) {
        Integer page = Integer.parseInt((String)params.get("page"));
        Integer limit = Integer.parseInt((String)params.get("limit"));
        IPage<SysLoginLogDTO> iPage = new Page<>(page,limit);
        IPage<SysLoginLogDTO> sysLoginLogDTOIPage = sysLoginLogMapper.selectPage(iPage, null);
        return sysLoginLogDTOIPage;
    }
}
