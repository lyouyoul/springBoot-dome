package cn.itcast.mapeer;


import cn.itcast.pojo.Produce;
import cn.itcast.pojo.User;
import cn.itcast.utils.MyMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

    User findById(Long id);

    List<User> findAll();

    List<User> findAll1();
}
