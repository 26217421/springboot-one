package com.jlu.wbw.one.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data//提供类的get、set、equals、hashCode、canEqual、toString方法
public abstract class BaseEntity<ID extends Serializable> implements Serializable {
    private static final long serialVersionUID = 123132132L;
    private ID id;
    private Date createTime = new Date();
    @JsonFormat(pattern = "yy-MM-dd  HH-mm-ss;")//后台到前台时间格式保持一致
    private Date updateTime = new Date();
}
