package com.gxshen.latte.DTO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author gxshen
 * @since 2022-08-25
 */
@Getter
@Setter
@TableName("sys_login_log")
public class SysLoginLogDTO {

    @TableId("ID")
    private String id;

    @TableField("USERNAME")
    private String username;

    @TableField("REAL_NAME")
    private String realName;

    @TableField("IP")
    private String ip;

    @TableField("LOGIN_CHANNEL")
    private String loginChannel;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
