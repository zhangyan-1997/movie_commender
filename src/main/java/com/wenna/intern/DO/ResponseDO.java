package com.wenna.intern.DO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/****
 * 所有ajax接口的返回对象
 */
@ToString
@Setter
@Getter
public class ResponseDO {

    private boolean success;
    private String msg;
    private int errorCode;
    private Object data;

    public ResponseDO(boolean success, String msg, int errorCode, Object data){
        this.success = success;
        this.msg = msg;
        this.errorCode = errorCode;
        this.data = data;
    }

}
