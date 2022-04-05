package com.zhbit.mapper;


import com.zhbit.bean.Notice;
import com.zhbit.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    /**
     * 获取所有用户
     */
    public List<User> getAllUserList();

    /**
     * 根据用户名和密码登录
     */
    User getUserByPassword(@Param("uName") String userName, @Param("uPassword") String password);

    /**
     * 向表中添加用户
     * 注册
     */
    int insertUser (@Param("uName") String userName, @Param("uPassword") String password);

    /**
     * 修改个人信息
     */
    int updateUser (@Param("uNo") int uNo, @Param("uName") String uName, @Param("uPassword") String uPassword);

    /**
     * 查询用户 拥有一对多的通知
     * 一对多查询
     */
    User getUserAndNotice (@Param("uNo") int uNo);


}
