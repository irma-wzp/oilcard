package com.lingc.oilcard.domain.result;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回对象
 *
 * @author wzp
 * @description 全局统一返回
 * @create on 2017/12/18.
 */
@Data
@NoArgsConstructor
public class Result implements Serializable {

    private static final long serialVersionUID = -3600676570241113666L;

    /**
     * 状态(0:正常，1:有异常)
     */
    private int status;

    /**
     * 消息
     */
    private String msg;

    /**
     * 数据
     */
    private Object data;


    /**
     * 全构造
     *
     * @param status 状态
     * @param msg    消息
     * @param data   数据
     */
    public Result(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Result)) {
            return false;
        }

        Result result = (Result) o;

        if (status != result.status) {
            return false;
        }
        if (msg != null ? !msg.equals(result.msg) : result.msg != null) {
            return false;
        }
        return data != null ? data.equals(result.data) : result.data == null;
    }

    @Override
    public int hashCode() {
        int result = status;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
