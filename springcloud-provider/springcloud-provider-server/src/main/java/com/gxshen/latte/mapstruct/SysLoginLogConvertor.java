package com.gxshen.latte.mapstruct;


import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.DTO.SysLoginLogDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

/**
 * @Author gxshen
 * @Date 2022/8/26
 * @Desc
 */
@Mapper
public interface SysLoginLogConvertor {

    SysLoginLogConvertor INSTANCE = Mappers.getMapper(SysLoginLogConvertor.class);

    List<SysLoginLog> toSysLoginLog(List<SysLoginLogDTO> dto);
}
