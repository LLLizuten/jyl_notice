package com.zhbit.biz;

import com.zhbit.bean.Notice;
import com.zhbit.mapper.NoticeMapper;
import com.zhbit.utils.SqlSessionUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author lzy
 * 2022/3/27 23:58
 */
@Service
@Transactional
public class NoticeBiz {
//    static SqlSession session = SqlSessionUtil.creat();
//    static NoticeMapper mapper = session.getMapper(NoticeMapper.class);
    @Autowired
    private NoticeMapper mapper;

    public NoticeMapper getMapper() {
        return mapper;
    }

    public void setMapper(NoticeMapper mapper) {
        this.mapper = mapper;
    }

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

    public List<Notice> getNoticeByNameM (String Ntitle){
        return mapper.getNoticeByNameM(Ntitle);
    }
    public List<Notice> getNoticeByTime (String StartTime, String EndTime){
        return mapper.getNoticeByTime(StartTime, EndTime);
    }
}
