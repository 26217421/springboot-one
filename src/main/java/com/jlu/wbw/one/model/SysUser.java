package com.jlu.wbw.one.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysUser extends BaseEntity<Long> {
    private static final long serialVersionUID = 456465465L;
    private String username;
    private String password;
    private String nickname;
    private String headImgUrl;
    private String phone;
    private String telephone;
    private String email;@JsonFormat(pattern = "yy-MM-dd")
    private Date birthday;
    private Integer sex;
    private Integer status;
    private String intro;

    public interface Status {
        int DISABLED = 0;
        int VALID = 1;
        int LOCKED = 2;
    }
}
