package net.wanho.controller;

import com.github.pagehelper.PageInfo;
import net.wanho.pojo.User;
import net.wanho.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserServiceI userServiceI;


    /**
     * 跳转首页
     * @param map
     * @return
     */
    @RequestMapping("toIndex")
    public String getAllUsers(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Map map){
        PageInfo<User> pageInfo = userServiceI.getUsersByPageNum(pageNum);
        map.put("pageInfo",pageInfo);
        return "index";
    }
/*    @RequestMapping("toIndex")
    public String getAllUsers(Map map){
        List<User> users = userServiceI.getAllUsers();
        map.put("users",users);
        return "index";
    }*/


    /**
     * 跳转到新增页
     * @return
     */
    @RequestMapping("/toCreate")
    public String toCreate(){
        return "create";
    }
    /**
     * 新增
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public String addUser(User user){
        userServiceI.addUser(user);
        return "redirect:toIndex";
    }


    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String delete(Integer id){
        userServiceI.deleteUser(id);
        return "redirect:toIndex";
    }

    /**
     * 查询个人详情
     * @param id
     * @param map
     * @return
     */
    @RequestMapping("/queryOneInfo")
    public String queryOneInfo(Integer id,Map map){
        User user = userServiceI.getUserById(id);
        map.put("user",user);
        return "update";
    }

    /**
     * 修改
     */

    @RequestMapping("/update")
    public String update(User user){
        System.out.println(user);
        userServiceI.updateUser(user);
        return "redirect:toIndex";
    }
}
