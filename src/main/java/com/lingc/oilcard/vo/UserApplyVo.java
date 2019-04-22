package com.lingc.oilcard.vo;

import lombok.Data;

/**
 * 用户报名包装类
 *
 * @author wzp
 * @descripton 接收前端用户报名信息
 * @time 2019/4/22 22:47
 * @modify
 */
@Data
public class UserApplyVo {

    /**
     * 姓名
     */
    private String username;

    /**
     * 联系方式
     */
    private String cellPhone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 微信id
     */
    private String code;
}
