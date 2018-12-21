package cn.itcast.service;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Auther: LYY
 * @Date: 2018/12/17 11:09
 * @Version: V1.0
 */
public interface UserService {
    User queryById(Long id);

    List<User> findAll();

    List<User> findAll1();
}
