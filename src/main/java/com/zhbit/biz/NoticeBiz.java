package com.zhbit.biz;

import com.zhbit.bean.Notice;
import com.zhbit.mapper.NoticeMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author Yanea
 * 2022/3/27 23:58
 */
public class NoticeBiz {
    SqlSession session = SqlSessionUtil.creat();
    NoticeMapper mapper = session.getMapper(NoticeMapper.class);
    public List<Notice> getAllNotice(){
        return mapper.getAllNoticeList();
    }

    public Notice getNoticeById(int noticeId){
        return mapper.getNoticeById(noticeId);
    }

    public List<Notice> getNoticeByTypeId(int typeId){
        return mapper.getNoticeByType(typeId);
    }

    public boolean addNotice(Notice notice){
        return mapper.addNotice(notice);
    }

    public boolean updateNotice(Notice notice){
        return mapper.updateNotice(notice);
    }

    public boolean deleteNotice(int noticeId){
        return mapper.deleteNotice(noticeId);
    }
}
