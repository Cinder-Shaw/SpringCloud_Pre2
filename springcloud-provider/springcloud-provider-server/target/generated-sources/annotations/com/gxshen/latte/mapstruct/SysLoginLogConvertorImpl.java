package com.gxshen.latte.mapstruct;

import com.gxshen.latte.DTO.SysLoginLog;
import com.gxshen.latte.DTO.SysLoginLogDTO;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-14T00:42:04+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_91 (Oracle Corporation)"
)
public class SysLoginLogConvertorImpl implements SysLoginLogConvertor {

    @Override
    public List<SysLoginLog> toSysLoginLog(List<SysLoginLogDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<SysLoginLog> list = new ArrayList<SysLoginLog>( dto.size() );
        for ( SysLoginLogDTO sysLoginLogDTO : dto ) {
            list.add( sysLoginLogDTOToSysLoginLog( sysLoginLogDTO ) );
        }

        return list;
    }

    protected SysLoginLog sysLoginLogDTOToSysLoginLog(SysLoginLogDTO sysLoginLogDTO) {
        if ( sysLoginLogDTO == null ) {
            return null;
        }

        SysLoginLog sysLoginLog = new SysLoginLog();

        sysLoginLog.setId( sysLoginLogDTO.getId() );
        sysLoginLog.setUsername( sysLoginLogDTO.getUsername() );
        sysLoginLog.setRealName( sysLoginLogDTO.getRealName() );
        sysLoginLog.setIp( sysLoginLogDTO.getIp() );
        sysLoginLog.setLoginChannel( sysLoginLogDTO.getLoginChannel() );
        if ( sysLoginLogDTO.getCreateTime() != null ) {
            sysLoginLog.setCreateTime( Date.from( sysLoginLogDTO.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }

        return sysLoginLog;
    }
}
