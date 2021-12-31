package com.az.complex.core.auth;

import com.az.complex.core.auth.entity.User;
import com.az.complex.core.auth.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class AuthApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void saveUser() {
        User user = new User();
        user.setUsername("truanz");
        user.setNickName("truanz");
        user.setGender(1);
        user.setBirthday(new Date());
        user.setAvatar("avatarUrl");
        user.setPhoneNum("17312345678");
        userService.save(user);
        System.out.println(userService.list());
    }

}
