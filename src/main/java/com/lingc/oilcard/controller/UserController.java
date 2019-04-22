package com.lingc.oilcard.controller;

import com.lingc.oilcard.domain.result.Result;
import com.lingc.oilcard.service.IUserService;
import com.lingc.oilcard.vo.UserApplyVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 *
 * @author wzp
 * @descripton
 * @time 2019/4/22 22:42
 * @modify
 */
@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    /**
     * userService
     */
    @Autowired
    private IUserService userService;


    @RequestMapping("/apply")
    public Result login(UserApplyVo userApplyVo) {

        return userService.addUser(userApplyVo);
    }
}
