package com.zhbit.test.springtest;

import com.zhbit.bean.Notice;
import com.zhbit.bean.Type;
import com.zhbit.biz.NoticeBiz;
import com.zhbit.biz.TypeBiz;
import com.zhbit.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author lzy
 * 2022/4/5 21:59
 */
public class SpringTest {
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        NoticeBiz noticeBiz = context.getBean("noticeBiz", NoticeBiz.class);
        List<Notice> allNotice = noticeBiz.getAllNotice();
        System.out.println(allNotice);

    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TypeBiz typeBiz = context.getBean("typeBiz", TypeBiz.class);
        List<Type> allType = typeBiz.getAllType();
        System.out.println(allType);
    }
}
