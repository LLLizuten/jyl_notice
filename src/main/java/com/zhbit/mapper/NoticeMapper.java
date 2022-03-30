package com.zhbit.mapper;

import com.zhbit.bean.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Yanea
 * 2022/3/27 20:21
 */
public interface NoticeMapper {
    /**
     * 往公告栏添加信息
     */
    boolean addNotice( Notice notice);

    /**
     * 根据id删除公告栏信息
     */
    boolean deleteNotice(@Param("nNo") int noticeId);

    /**
     * 修改公告栏信息
     */
    boolean updateNotice(@Param("notice") Notice notice);

    /**
     * 获取公告栏列表
     */
    List<Notice> getAllNoticeList();

    /**
     * 根据类型id获取公告
     */
    List<Notice> getNoticeByType(@Param("tNo") int typeId);

    /**
     * 根据公告id获取公告信息
     */
    Notice getNoticeById(@Param("nNo") int noticeId);
}
