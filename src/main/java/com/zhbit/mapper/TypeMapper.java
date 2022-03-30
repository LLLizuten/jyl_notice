package com.zhbit.mapper;

import com.zhbit.bean.Type;

import java.util.List;

/**
 * @author Yanea
 * 2022/3/27 20:21
 */
public interface TypeMapper {
    /**
     * 获取所有公告类型
     * @return
     */
    List<Type> getAllTypeList();


}
