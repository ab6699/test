package net.wanho.mapper;

import net.wanho.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(Integer id);

    void  updateUser(User user);

    User getUserById(Integer id);

}
