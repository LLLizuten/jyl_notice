package com.zhbit.mapper;

import com.zhbit.bean.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TypeMapper {
    /**
     * 获取所有公告类型
     * @return
     */
    List<Type> getAllTypeList();

    /**
     * 删除公告类型
     */
    int deleteType(@Param("Tno") int tno);

    /**
     * 添加公告类型
     */
    int addType(@Param("TtypeName") String TtypeName);

    /**
     * 修改公告类型
     */
    int alterType(@Param("Tno") int Tno, @Param("TtypeName") String TtypeName);

}
