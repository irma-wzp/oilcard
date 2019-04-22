package com.lingc.oilcard.service;

import com.lingc.oilcard.domain.result.Result;
import com.lingc.oilcard.vo.UserApplyVo;

/**
 * @author wzp
 * @descripton impl
 * @time 2019/4/22 22:43
 * @modify
 */
public interface IUserService {

    /**
     * 添加用户
     * @param userApplyVo {@link UserApplyVo}
     * @return {@link Result}
     */
    Result addUser(UserApplyVo userApplyVo);
}
