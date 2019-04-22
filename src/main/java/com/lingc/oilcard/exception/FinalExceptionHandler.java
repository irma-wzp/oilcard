package com.lingc.oilcard.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在进入Controller之前，譬如请求一个不存在的地址，404错误。
 * @author wzp
 * @descripton
 * @time 2019/4/22 22:54
 * @modify
 */
public class FinalExceptionHandler implements ErrorController {

    @Override
    public String getErrorPath() {

        System.out.println("getErrorPath");
        return "error";
    }


    @RequestMapping(value = "/error")
    public Object error(HttpServletResponse resp, HttpServletRequest req) {
        System.out.println("error");
        // 错误处理逻辑
        return "error";
    }

}