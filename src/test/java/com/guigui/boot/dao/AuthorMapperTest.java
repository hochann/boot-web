package com.guigui.boot.dao;

import com.guigui.boot.bean.Author;
import com.guigui.boot.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class AuthorMapperTest {
    @Autowired
    AuthorMapper authorMapper;
    @Autowired
    User user;
    @Test
    void getTime(){
        Date date = new Date();
        System.out.println(user+"时间"+date);
    }
    @Test
    void getList() {
        List<Author> authors = authorMapper.getList();
        System.out.println(authors);
        //Author author = authorMapper.getAuthorById(1, "");
        Author a = new Author("na","123",0,new Date());
        System.out.println("我是新"+a);
//        int i = authorMapper.addAuthor(a);
      //  System.out.println("添加"+i+"条记录成功！");
        int i1 = authorMapper.deleteAuthorById(3);
        System.out.println("删除"+i1+"条记录成功！");
        System.out.println("所有用户"+authorMapper.getList());
        Author b = new Author();
        b.setUid(4);
        b.setUsername("师傅");
        b.setPassword("1234");
        //Row: 4, na, 123, 0, 2021-03-29 04:27:54
        System.out.println(b);
        int i3 = authorMapper.updateAuthorById(b);
        System.out.println(i3+"跟新纪录");
    }
}