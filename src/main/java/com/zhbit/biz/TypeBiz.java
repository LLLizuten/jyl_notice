package com.zhbit.biz;

import com.zhbit.bean.Type;
import com.zhbit.mapper.TypeMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author lzy
 * 2022/3/28 0:00
 */
public class TypeBiz {
    SqlSession session = SqlSessionUtil.creat();
    TypeMapper mapper = session.getMapper(TypeMapper.class);
    public List<Type> getAllType(){
        return mapper.getAllTypeList();
    }
}
