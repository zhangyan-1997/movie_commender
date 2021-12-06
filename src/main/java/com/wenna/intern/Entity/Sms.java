package com.wenna.intern.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Sms {
    private int id;
    private int userId;
    private String mobile;
    private String content;
    private String veriCode;
    private int smsType;
    private int status;
    private int code;
    private String message;
    private Date addTime;
    private Date updateTime;
    private String userIp;
}
