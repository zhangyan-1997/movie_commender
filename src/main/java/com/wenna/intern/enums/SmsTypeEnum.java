package com.wenna.intern.enums;

import com.wenna.intern.constant.SmsConstant;

public enum SmsTypeEnum {
    REGISTER(1, "绑定手机"),
    NOTIFICATION(2, "活动通知");

    private int id;
    private String name;

    SmsTypeEnum(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static SmsTypeEnum getById(int id){
        for (SmsTypeEnum smsType: SmsTypeEnum.values()) {
            if (smsType.getId() == id){
                return smsType;
            }
        }
        return null;
    }

    public static String getSmsTemplate(SmsTypeEnum smsType){
        switch (smsType) {
            case REGISTER:
                return SmsConstant.SMS_BIND_CONTENT;
            case NOTIFICATION:
                return SmsConstant.SMS_NOTIFY_CONTENT;
            default:
                return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
