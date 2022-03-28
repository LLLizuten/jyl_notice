package com.zhbit.mapper;

import com.zhbit.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lzy
 * 2022/3/27 20:21
 */
public interface UserMapper {
    /**
     * 获取所有用户
     */
    public List<User> getAllUserList();

    /**
     * 根据用户名和密码登录
     */
    User getUserByPassword(@Param("uName") String userName, @Param("uPassword") String password);
}
