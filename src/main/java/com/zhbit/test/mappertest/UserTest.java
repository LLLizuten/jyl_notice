package com.zhbit.test.mappertest;

import com.zhbit.bean.User;
import com.zhbit.mapper.TypeMapper;
import com.zhbit.mapper.UserMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author lzy
 * 2022/3/27 21:22
 */
public class UserTest {
    /**
     * 测试getAllUserList
     */
    @Test
    public void test(){
        SqlSession session = SqlSessionUtil.creat();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    /**
     * getUserByPassword
     */
    @Test
    public void test2(){
        SqlSession session = SqlSessionUtil.creat();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User userByPassword = mapper.getUserByPassword("admin", "admin");
        System.out.println(userByPassword);
    }
}
