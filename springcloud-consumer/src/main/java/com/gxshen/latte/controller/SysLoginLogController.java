package com.gxshen.latte.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.feign.SysLoginLogFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author gxshen
 * @Date 2022/8/26
 * @Desc
 */
@RestController
public class SysLoginLogController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    @Lazy
    private SysLoginLogFeignClient sysLoginLogFeignClient;

    public static final String rest_path = "http://localhost:8081/";

    public static final String path = "http://springcloud-provider/";

    @GetMapping("/getLoginLog")
    public Page<SysLoginLog> getSysLoginLogByPage(@RequestParam Map<String,Object> params){
        Page forObject = restTemplate.getForObject(path + "provider/sysLoginLog/sysLoginLog/?page={page}&limit={limit}", Page.class, params);
        return forObject;
    }

    @GetMapping("/getLoginLogByFeign")
    public Page<SysLoginLog> getSysLoginLogPageByFeign(@RequestParam Map<String,Object> params){
        return sysLoginLogFeignClient.getLoginLog(params);
    }

}
