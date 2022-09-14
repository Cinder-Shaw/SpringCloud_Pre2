package com.gxshen.latte.feign;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.feign.fallback.SysLoginLogFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

//@FeignClient(name="springcloud-provider",fallback = SysLoginLogFeignFallback.class)

@Component
@FeignClient( name = "springcloud-provider",path = "/provider" ,
        fallback = SysLoginLogFeignFallback.class)
public interface SysLoginLogFeignClient {

    @GetMapping("/sysLoginLog/sysLoginLog")
    Page<SysLoginLog> getLoginLog(@RequestParam Map<String,Object> params);

}