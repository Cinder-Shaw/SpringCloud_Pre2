package com.gxshen.latte.controller;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.DTO.SysLoginLogDTO;
import com.gxshen.latte.mapstruct.SysLoginLogConvertor;
import com.gxshen.latte.service.ISysLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gxshen
 * @since 2022-08-25
 */
@RestController
@RequestMapping("/sysLoginLog")
public class SysLoginLogController {

    @Autowired
    private ISysLoginLogService sysLoginLogService;

    @GetMapping("/sysLoginLog")
    public Page<SysLoginLog> querySysLoginLogByPage(@RequestParam Map<String, Object> params){
        IPage<SysLoginLogDTO> ipage = sysLoginLogService.querySysLoginLogByPage(params);
        List<SysLoginLogDTO> records = ipage.getRecords();
        List<SysLoginLog> sysLoginLogs = SysLoginLogConvertor.INSTANCE.toSysLoginLog(records);
        Page<SysLoginLog> pageResult = new Page<SysLoginLog>(ipage.getCurrent(),ipage.getSize()) ;
        pageResult.setRecords(sysLoginLogs);
        pageResult.setTotal(ipage.getTotal());
       return pageResult;
    }
}

