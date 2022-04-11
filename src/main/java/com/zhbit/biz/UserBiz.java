package com.zhbit.biz;

import com.zhbit.bean.Notice;
import com.zhbit.bean.User;
import com.zhbit.mapper.UserMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author lzy
 * 2022/3/28 0:01
 */
@Service
@Transactional
public class UserBiz {
//    static SqlSession session = SqlSessionUtil.creat();
//    static UserMapper mapper = session.getMapper(UserMapper.class);
    @Autowired
    private UserMapper mapper;

    public UserMapper getMapper() {
        return mapper;
    }

    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    public User login(String userName, String password){
        return mapper.getUserByPassword(userName,password);
    }

    public int register (String username, String password) {
        return mapper.insertUser(username, password);
    }

    public int update (int uNo, String uName, String uPassword) {
        return mapper.updateUser(uNo, uName, uPassword);
    }

    public User getUserAndNotice (int uNo){
        return mapper.getUserAndNotice(uNo);
    }
}
