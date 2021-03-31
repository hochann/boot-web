package com.guigui.boot.dao;

import com.guigui.boot.bean.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AuthorMapper {
    List<Author> getList();
    Author getAuthorById(Integer id,String username);
    int addAuthor(Author author);
    int deleteAuthorById(Integer id);
    int updateAuthorById(Author author);
}
