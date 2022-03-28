package com.zhbit.test.mappertest;

import com.zhbit.bean.Type;
import com.zhbit.mapper.TypeMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author lzy
 * 2022/3/27 20:50
 */
public class TypeTest {
    /**
     * 测试getAllTypeList
     */
    @Test
    public void test(){
        SqlSession session = SqlSessionUtil.creat();
        TypeMapper mapper = session.getMapper(TypeMapper.class);
        List<Type> list = mapper.getAllTypeList();
        for (Type type : list) {
            System.out.println(type);
        }
    }
}
