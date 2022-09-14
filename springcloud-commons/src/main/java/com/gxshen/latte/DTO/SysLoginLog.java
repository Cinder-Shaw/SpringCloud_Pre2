package com.gxshen.latte.DTO;

/**
 * @Author gxshen
 * @Date 2022/8/26
 * @Desc
 */

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author gxshen
 * @since 2022-08-25
 */
@Data
public class SysLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String realName;

    private String ip;

    private String loginChannel;

    private Date createTime;


}