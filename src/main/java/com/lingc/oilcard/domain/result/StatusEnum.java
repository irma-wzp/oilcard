package com.lingc.oilcard.domain.result;

import lombok.Getter;

/**
 * @author wzp
 * @description 状态 - 枚举类
 * @create on 2017/12/7.
 */
@Getter
public enum StatusEnum {
    /**
     * 成功
     */
    SUCCESS(0, "成功"),

    /**
     * 添加成功
     */
    SUCCESS_ADD(0,"添加成功"),

    /**
     * 查询成功
     */
    SUCCESS_SELECT(0,"查询成功"),

    /**
     * 修改成功
     */
    SUCCESS_UPDATE(0,"修改成功"),

    /**
     * 数据库异常
     */
    DATABASE_ERROR(500,"执行数据库操作时发生错误"),

    /**
     * 服务异常
     */
    SERVER_ERROR(504, "发生不可预知的错误"),

    /**
     * 文件解析错误
     */
    FILE_ERROR(502, "文件解析错误"),

    /**
     * 文件没有数据
     */
    FILE_NO_DATA(404, "未解析到文件中的数据，或文件中的数据为空"),

    /**
     * 失败
     */
    DEFEAT(501, "失败"),

    /**
     * 未知错误
     */
    UNKNOWN_ERROR(503, "未知错误"),

    /**
     * 错误操作
     */
    ERROR(505, "错误操作"),

    /**
     * 无数据
     */
    NO_DATA(404, "无数据"),

    /**
     * 无可用数据导出
     */
    NO_FILE_DATA(404, "无可用数据导出"),

    /**
     * URL地址错误
     */
    NO_URL(404, "URL地址错误"),

    /**
     * 没有权限
     */
    NO_RIGHTS(401, "该用户无法操作此功能"),

    /**
     * 检查不通过
     */
    CHECK_DATA(407, "请正确填写信息后重试"),

    /**
     * 文件上传失败
     */
    FILE_UPLOAD(600, "文件上传失败，请重试"),

    /**
     * 文件大小不符合要求
     */
    FILE_SIZE(601, "文件大小不符合要求"),

    /**
     * 文件格式不正确
     */
    FILE_FORMAT(603, "文件格式不正确"),

    /**
     * 文件不能为空
     */
    NO_FILE(604, "文件不能为空"),

    /**
     * 参数错误
     */
    PRAM_ERROR(605,"参数错误"),

    /**
     * 参数为空
     */
    NO_PRAM(400, "参数为空");

    /**
     * 状态码
     */
    private final int CODE;

    /**
     * 描述信息
     */
    private final String EXPLAIN;

    StatusEnum(int code, String explain) {
        this.CODE = code;
        this.EXPLAIN = explain;
    }

}
