package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
    public User queryUserById(String id)
    {
        return userMapper.queryUserById(id);
    }

}
