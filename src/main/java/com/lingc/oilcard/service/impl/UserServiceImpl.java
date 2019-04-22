package com.lingc.oilcard.service.impl;

import com.lingc.oilcard.dao.UserMapper;
import com.lingc.oilcard.domain.entity.User;
import com.lingc.oilcard.domain.result.Result;
import com.lingc.oilcard.domain.result.StatusEnum;
import com.lingc.oilcard.service.IUserService;
import com.lingc.oilcard.vo.UserApplyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service实现类
 *
 * @author wzp
 * @descripton
 * @time 2019/4/22 22:44
 * @modify
 */
@Service("UserService")
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     *
     * @param userApplyVo {@link UserApplyVo}
     * @return {@link Result}
     */
    @Override
    public Result addUser(UserApplyVo userApplyVo) {
        User user = userMapper.selectByPrimaryKey(1L);
        System.out.println(user);

        return new Result(StatusEnum.SUCCESS.getCODE(), StatusEnum.SUCCESS.getEXPLAIN(), user);
    }
}
