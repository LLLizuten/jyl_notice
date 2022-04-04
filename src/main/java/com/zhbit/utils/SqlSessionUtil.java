package com.zhbit.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 2022/3/27 20:22
 * 用于加载核心配制文件
 */
public class SqlSessionUtil {
    public static SqlSession creat(){
        SqlSession sqlSession = null;
        try {
            //1.加载核心配置文件
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            //2.获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //3.获取SqlSessionFactory
            SqlSessionFactory factory = sqlSessionFactoryBuilder.build(stream);
            //4.获取SqlSession:Java和数据库之间的会话,参数true:设置默认自动提交事务
            sqlSession = factory.openSession(true);
        } catch (IOException e) {
            System.out.println("连接失败");
            e.printStackTrace();
        }
        return sqlSession;
    }
}
