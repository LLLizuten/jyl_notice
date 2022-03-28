package com.zhbit.biz;

import com.zhbit.bean.User;
import com.zhbit.mapper.UserMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author lzy
 * 2022/3/28 0:01
 */
public class UserBiz {
    SqlSession session = SqlSessionUtil.creat();
    UserMapper mapper = session.getMapper(UserMapper.class);
    public User login(String userName, String password){
        return mapper.getUserByPassword(userName,password);
    }
}
