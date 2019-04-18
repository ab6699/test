package net.wanho.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.wanho.mapper.UserMapper;
import net.wanho.pojo.User;
import net.wanho.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceI {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public PageInfo<User> getUsersByPageNum(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<User> users = userMapper.getAllUsers();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User getUserById(Integer id) {

        return userMapper.getUserById(id);
    }
}
