package com.jlu.wbw.one;

import com.jlu.wbw.one.dao.UserDao;
import com.jlu.wbw.one.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;

@SpringBootTest
class OneApplicationTests {
    @Autowired
    //DataSource dataSource;

    @Resource
    UserDao userDao;


    SysUser user = new SysUser();
    @Test
    void contextLoads() throws ParseException {
        //SimpleDateFormat b = new SimpleDateFormat("yy-MM-dd");
        TimeZone time = TimeZone.getTimeZone("ETC/GMT-8");

        TimeZone.setDefault(time);
        user.setBirthday(new Date("2020/02/03"));
        user.setId((long) 43);
        //System.out.println(dataSource.getClass());
        System.out.println(userDao.getUser("alex"));
        userDao.updateUser(user);
    }



}
