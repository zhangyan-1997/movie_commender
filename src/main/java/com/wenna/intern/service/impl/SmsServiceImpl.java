package com.wenna.intern.service.impl;

import com.wenna.intern.Entity.Sms;
import com.wenna.intern.enums.SmsTypeEnum;
import com.wenna.intern.service.SmsService;

public class SmsServiceImpl implements SmsService {
    @Override
    public int insert(Sms sms) {
        return 0;
    }

    @Override
    public int update(Sms sms) {
        return 0;
    }

    @Override
    public Sms loadById(int id) {
        return null;
    }

    @Override
    public int getDaySendTimesByUserIdAndMobile(int userId, String mobile) {
        return 0;
    }

    @Override
    public Sms getDayLastSmsByUserId(int userId) {
        return null;
    }

    @Override
    public boolean sendSms(int userId, String mobile, SmsTypeEnum content, String userIp) {
        return false;
    }

    @Override
    public Sms getDayLastestSmsByUserId(String mobile) {
        return null;
    }

    @Override
    public boolean verifyCode(int userId, String mobile, String veriCode) {
        return false;
    }

    @Override
    public int getDaySendCountByMobile(String mobile) {
        return 0;
    }
}
