package net.wanho.service;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;

import java.util.List;

public interface UserServiceI {

    List<User> getAllUsers();
    PageInfo<User> getUsersByPageNum(Integer pageNum);

    void addUser(User user);

    void deleteUser(Integer id);

    void  updateUser(User user);

    User getUserById(Integer id);


}
