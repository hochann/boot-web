package com.guigui.boot.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@ToString
@NoArgsConstructor
public class Author {

  private Integer uid;
  private String username;
  private String password;
  private Integer number;
 // private java.sql.Timestamp lastDate;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date lastDate;

    public Author(String username, String password, Integer number, Date lastDate) {
        this.username = username;
        this.password = password;
        this.number = number;
        this.lastDate = lastDate;
    }
}
