package com.gxshen.latte.feign.fallback;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.feign.SysLoginLogFeignClient;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SysLoginLogFeignFallback implements SysLoginLogFeignClient {

    @Override
    public Page<SysLoginLog> getLoginLog(Map<String, Object> params) {
        return new Page<SysLoginLog>(-1,-1);
    }
}
