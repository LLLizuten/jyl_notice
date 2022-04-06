package com.zhbit.biz;

import com.zhbit.bean.Type;
import com.zhbit.mapper.TypeMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzy
 * 2022/3/28 0:00
 */
@Service
public class TypeBiz {
    static SqlSession session = SqlSessionUtil.creat();
    static TypeMapper mapper = session.getMapper(TypeMapper.class);
    /**
     * 获取所有公告
     */
    public List<Type> getAllType(){
        return mapper.getAllTypeList();
    }
    /**
     * 删除公告类型
     */
    public int deleteType(@Param("Tno") int tno){
        return mapper.deleteType(tno);
    }

    /**
     * 添加公告类型
     */
    public int addType(@Param("TtypeName") String TtypeName){
        return mapper.addType(TtypeName);
    }

    /**
     * 修改公告类型
     */
    public int alterType(@Param("Tno") int Tno, @Param("TtypeName") String TtypeName){
        return mapper.alterType(Tno, TtypeName);
    }
}
