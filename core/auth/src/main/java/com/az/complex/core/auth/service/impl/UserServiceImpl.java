package com.az.complex.core.auth.service.impl;

import com.az.complex.core.auth.dao.UserMapper;
import com.az.complex.core.auth.entity.User;
import com.az.complex.core.auth.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
