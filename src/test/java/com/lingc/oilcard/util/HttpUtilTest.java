package com.lingc.oilcard.util;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wzp
 * @descripton
 * @time 2019/4/23 1:09
 * @modify
 */
public class HttpUtilTest {


    private static final String APPID = "wx3ae88482e16dfd23";// 微信应用唯一标识
    private static final String SECRET = "";
    private static final String CODE = "033hpeew0LUDEb1Bczdw0BJ9ew0hpeev";


    /**
     * 发送请求用code换取sessionKey和相关信息
     */
    @Test
    public void request() throws Exception {

        String stringToken = String.format(
                "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",
                APPID, SECRET, CODE);
        String response = HttpUtil.request(stringToken, "GET", null);
        System.out.println(response);
    }

}