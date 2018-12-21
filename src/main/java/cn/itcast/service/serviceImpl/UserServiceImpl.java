package cn.itcast.service.serviceImpl;

import cn.itcast.mapeer.UserMapper;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Auther: LYY
 * @Date: 2018/12/17 11:10
 * @Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public User queryById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        PageHelper.startPage(1,1000);
        List<User> users=userMapper.findAll();
        return users;
    }

    @Override
    public List<User> findAll1() {
        String key="test";
        PageHelper.startPage(1,1000, "score desc");
        List<User> users=new ArrayList<>();
        if(!redisTemplate.hasKey(key)){
            System.out.println("进来");
            users=redisTemplate.opsForList().range(key,0,-1);
        }else{
            users=userMapper.findAll1();
            redisTemplate.opsForList().rightPush(key,users);
        }
        return users;
    }
}
