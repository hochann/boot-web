package com.guigui.boot.bean;


public class Comment {

  private long aid;
  private long cid;
  private String name;
  private String msg;
  private String replyData;


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  public String getReplyData() {
    return replyData;
  }

  public void setReplyData(String replyData) {
    this.replyData = replyData;
  }

}
