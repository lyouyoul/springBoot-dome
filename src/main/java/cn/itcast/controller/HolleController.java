package cn.itcast.controller;

import cn.itcast.config.JdbcConfig;
import cn.itcast.mapeer.UserMapper;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import cn.itcast.utils.JoeJSONResult;
import com.github.pagehelper.PageInfo;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Author: zhl
 * @Date: Createdtime 2018/12/12 22:12
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/user/")
public class HolleController {

    //@Autowired
    //private DataSource dataSource;

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User test(@PathVariable("id") Long id){
        return userService.queryById(id);
    }

    @GetMapping("findAll")
    public JoeJSONResult findAll(){
        List<User> users=userService.findAll();
        for (User user:users){
            System.out.println(user);
        }
        PageInfo pageInfo=new PageInfo(users);
        return JoeJSONResult.ok(pageInfo);
    }

    @GetMapping("findAll1")
    public JoeJSONResult findAll1(){
        List<User> users=userService.findAll1();
        PageInfo pageInfo=new PageInfo(users);
        return JoeJSONResult.ok(pageInfo);
    }
}
